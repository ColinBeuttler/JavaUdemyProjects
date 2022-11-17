public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "blue");

        Car sameCar = car;

        car.equals(sameCar);
    }

}
