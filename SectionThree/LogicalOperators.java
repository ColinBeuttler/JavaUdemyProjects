import javax.swing.text.StyledEditorKit;

public class LogicalOperators {
    public static void main(String[] args) {
        int chemistry = 78;
        int english = 65;
        String language = "Java";

        if (chemistry > 75 || english > 75 || language.equals("Java")){
            System.out.println("Congrats, you got the scholarship");
        }
        else {
            System.out.println("Sorry, better luck next time.");
        }
 
        int credits = 56;
        double gpa = 3.2;

        if ( credits >= 40 && gpa >= 2.0){
            System.out.println("\nYou go the D!!");
        }
        else {
            System.out.println("Sorry Dude");
        }
    }
}
