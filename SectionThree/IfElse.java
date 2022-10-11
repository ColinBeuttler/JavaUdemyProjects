public class IfElse {
    public static void main(String[] args) {
        int grade = 45;
        
        if(grade >= 80){
            System.out.println("Great Job!! You got an A");
        }
        else if( grade >=70){
            System.out.println("You got a B!!");
        }
        else if(grade >=60){
            System.out.println("You got a C.");
        }
        else{
            System.out.println("Better luck next time.");
        }
    }
}
