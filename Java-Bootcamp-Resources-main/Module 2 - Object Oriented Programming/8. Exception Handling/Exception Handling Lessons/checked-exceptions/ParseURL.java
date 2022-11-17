import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {

        try{
            URL url = new URL("https://www.google.com");
        }
        catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        
    }

}
