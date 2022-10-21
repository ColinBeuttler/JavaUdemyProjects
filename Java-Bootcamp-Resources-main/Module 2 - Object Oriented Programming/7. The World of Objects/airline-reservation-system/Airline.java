import java.util.Arrays;

public class Airline {
    private Person[] seats;

    public Airline() {
        this.seats = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person, int index) {
        this.seats[person.getSeatNumber() - 1] = new Person(person);
    }

    public void createReservation(Person person) {

        while (seats[person.getSeatNumber() - 1] != null) {

            System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is "
                    + person.getSeatNumber() + ".");

        }
    }
    
    public String toString() {
        String temp = "";
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null) {
                temp += seats[i].toString();
                temp += "\n\n";
            } else {
                temp += "Seat " + (i + 1) + " is empty";
                temp += "\n\n";
            }
        }
        return temp;
    }
}
