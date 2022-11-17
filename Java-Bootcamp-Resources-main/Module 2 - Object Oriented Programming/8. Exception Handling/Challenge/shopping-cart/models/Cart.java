package models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(items.get(index));
    }

    public void setItem(Item items, int index) {
        this.items.set(index, new Item(items));
    }

   /**
   * Name: add
   * @param item
   * @return boolean
   *
   * Inside the function:
   *   1. Adds an item to the cart if it wasn't already added.
   */
    
   public boolean add(Item item) {
       if (this.items.contains(item)) {
           return false;
       } else {
           this.items.add(new Item(item));
           return true;
       }
   }
   
   public boolean isEmpty() {
       return this.items.isEmpty();
   }
   
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */

   public void remove(String name) {
       if (items.isEmpty()) {
           throw new IllegalStateException("Cannot remove items from an empty cart.");
    }
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equals(name)) {
                this.items.remove(i);
            }
        }
    }
  
   /**
   *  Name: checkout
   *  @return (String)
   *
   *  Inside the function:
   *   1. Calculates the subtotal (price before tax).
   *   2. Calculates the tax (assume tax is 13%).
   *   3. Calculates total: subtotal + tax
   *   4. Returns a String that resembles a receipt. See below.
   */
    
   public String checkout() {
       if (items.isEmpty()) {
           throw new IllegalStateException("Cannot Checkout with an empty cart.");
       }
 
       double subtotal = 0;
       for (int i = 0; i < items.size(); i++) {
           subtotal += items.get(i).getPrice();
       }
       return "\tRECEIPT\n\n" +
               "\tSubtotal: $" + subtotal + "\n" +
               "\tTax: $" + (subtotal * 0.13) + "\n" +
               "\tTotal: $" + (subtotal * 1.13) + "\n";

   }
   
   public String toString() {
       String temp = "";
       for (int i = 0; i < items.size(); i++) {
           temp += items.get(i).toString() + "\n";
       }
       return temp;
   } 
}
