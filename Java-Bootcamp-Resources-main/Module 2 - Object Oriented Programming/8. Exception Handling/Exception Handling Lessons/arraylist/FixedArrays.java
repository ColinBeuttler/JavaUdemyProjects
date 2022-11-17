import java.util.ArrayList;

public class FixedArrays {
    public static void main(String[] args) {
        String[] group = new String[] {"Sam", "Noah", "Liam"};
        ArrayList<String> names = new ArrayList<String>();

        names.add("Joe");
        names.add("Jim");
        names.add("John");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(1));
        }
        names.set(0, "JoeFresh");
        names.add(3, "Katie");
    }
}
