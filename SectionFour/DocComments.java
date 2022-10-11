

public class DocComments {
    public static void main(String[] args) {
        
    }
// function name: greet;
// inside the function:

// 1. prints Hi


    public static void greet(){
        System.out.println("hi");
    }

    /**
     * 
     * Function name: printText
     * 
     * @param name (String)
     * @param age (String)
     * 
     * 
     * Inside the function:
     * 1. Prints the name and age inside of a text
     */

    public static void printText( String name, String age){
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");

    }
    /**
     * Function name: 
     * 
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. Return the area of a rectangle
     */

    public static double calculateArea(double length, double width){
        double area = length * width;
        return area;
    };

}
