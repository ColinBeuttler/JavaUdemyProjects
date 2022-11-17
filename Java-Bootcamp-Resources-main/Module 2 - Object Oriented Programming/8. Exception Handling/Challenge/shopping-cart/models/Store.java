package models;


public class Store {

    private Item[][] inventory;

    public Store() {
        this.inventory = new Item[7][3];
    }

    public Item getItem(int row, int column) {
        return new Item(this.inventory[row][column]);
    }

    public void setItem(int row, int column, Item item) {
        this.inventory[row][column] = new Item(item);
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < inventory.length; i++) {
            switch (i) {
                case 0:
                    temp += "\tDRINKS:        ";
                    break;
                case 1:
                    temp += "\tCEREAL:        ";
                    break;
                case 2:
                    temp += "\tDAIRY:         ";
                    break;
                case 3:
                    temp += "\tDELI:          ";
                    break;
                case 4:
                    temp += "\tGREENS:        ";
                    break;
                case 5:
                    temp += "\tCLOTHING:      ";
                    break;
                case 6:
                    temp += "\tELECTRONICS:   ";
                    break;
            }

            for (int j = 0; j < inventory[i].length; j++) {
                temp += this.inventory[i][j].toString();
            }
            temp += "\n\n";
        }
        temp += "\t************************************************************************\n";
        return temp;
    }


}
