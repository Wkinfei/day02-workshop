package MyProg;

import java.util.LinkedList;
import java.util.List;



public class ShoppingCart1 {
    public static final String APPLE = "apple";
    public static final String ORANGE = "orange";

    private List<Item1> cart;

    public ShoppingCart1(){
        this.cart = new LinkedList<>();
    }

    public void listContents(){
        if(cart.size() <= 0){
            System.out.println("Your cart is empty");
        }else{
            for(int i = 0; i < cart.size(); i++){
                Item1 cartItem = cart.get(i);
                System.out.printf("%d. %s, %d, $%.2f\n", i + 1, cartItem.getName(), cartItem.getQuantity(), cartItem.getPrice());
            }
        }
    }// listContents()

    public boolean addToCart(String item, Integer quantity, Float price){
        Item1 toAdd;
        switch(item.toUpperCase()){
            case "APPLE" :
                toAdd = new Apple1(); // name & code
                break;
            case "ORANGE":
                toAdd = new Orange1();
                break;
            default:
                return false;
    }
    // Set quantity and price
    toAdd.setQuantity(quantity);
    toAdd.setPrice(price);
    //add item into the list
    this.cart.add(toAdd); 
  
    return true;
    }// addToCart

    public void removeFromCart(String index){
        try{
            Integer removeItemNo = Integer.parseInt(index)-1;
            this.cart.remove((int)removeItemNo);
            System.out.println("Item removed from shopping cart");
        }
        catch(Exception e){
            System.out.println("Cannot find item in the shopping cart");
        }
    }// removeFromCart

    public void calculate(){
        this.calculate(0f);
    }

    public void calculate(Float discount){
        Float total = 0f;
        for (Item1 item: this.cart) {
            Float subtotal = item.totalPrice();
            System.out.printf("%s [%s] %d@%.2f = $%.2f\n", 
                    item.getName(), item.getCode(), item.getQuantity(), item.getPrice(), subtotal);
            total += subtotal;
        }

        if (0 != discount) {
            System.out.printf("Applying a %2.2f%% discount to $%.2f\n", discount, total);
            total -= (total * discount);
        }
        System.out.println("-".repeat(20));
        System.out.printf("Grand total: $%.2f\n", total);
    }
    
}//Class
