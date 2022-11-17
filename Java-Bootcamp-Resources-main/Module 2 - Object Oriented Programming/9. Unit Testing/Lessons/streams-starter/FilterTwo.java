import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTwo {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> lowPrices = new ArrayList<Double>();
    prices.stream()
    .filter((price) -> price < 5)
            .collect(Collectors.toList());

    }

}
