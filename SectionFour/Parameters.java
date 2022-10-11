public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.2, 4.3);
        measureRectangle(3.2, 4.1);
        measureRectangle(3.5, 1.2);
        measureRectangle(10.1, 4.3);
        measureRectangle(20.2, 4.3);
        
    }

    public static void measureRectangle (double length, double width){
        double area = length * width;
        System.out.println("\nThe area of a rectangle with lenght " + length + " and width " + width + " is equal to " + area + "\n");
    }

}
