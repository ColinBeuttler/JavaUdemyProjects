public class Pyramid {
    public static void main(String[] args) {
        String temp = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {     
                if (j == i) {
                    temp = " * ";
                }
                else {
                    temp = "   ";
               }
               System.out.print(temp);
            }
          System.out.print("\n");
        }
    }
}
