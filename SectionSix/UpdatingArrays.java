import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = { "Espresso", "Iced Coffee", "Macchiato" };

        // String menuString = ; 
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
       System.out.println(Arrays.toString(newMenu));
    }
}
