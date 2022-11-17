public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable
        Car car2 = car;
        car2.setPrice(8000);

        System.out.print(car.getPrice());
    }
}
