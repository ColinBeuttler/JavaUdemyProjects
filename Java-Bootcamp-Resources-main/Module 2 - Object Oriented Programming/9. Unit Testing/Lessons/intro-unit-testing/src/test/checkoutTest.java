import main.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;



public class checkoutTest {

    @Test

    public void subTotalIsValid() {
        assertEquals(19.2, Main.getSubTotal());
    }

    @Test

    public void taxIsValid() {
        assertEquals(3.9, Main.getTax(30));
    }

    @Test

    public void totalIsValid() {
        
    }

}

