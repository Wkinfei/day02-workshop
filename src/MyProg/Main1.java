package MyProg;

import java.util.Scanner;

public class Main1 {

    public static final String CHECKOUT = "checkout";
    public static final String ADD = "add";
    public static final String REMOVE = "remove";
    public static final String LIST = "list";

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    Boolean stop = false;
    ShoppingCart1 shoppingCart = new ShoppingCart1();

            while (!stop) {
                String line = sc.nextLine();
                String[] terms = line.trim().split(" ");

                switch (terms[0]) {

                    // add apple quantity price
                    case ADD:
                        String item = terms[1];
                        Integer quantity = Integer.parseInt(terms[2]);
                        Float price = Float.parseFloat(terms[3]);
                        if (shoppingCart.addToCart(item, quantity, price))
                            System.out.printf("%dx%s added to your shopping cart\n",quantity, item);
                        else
                            System.err.printf("%s is not in our inventory.\n", item);
                        break;

                    // list
                    case LIST:
                        shoppingCart.listContents();
                        break;

                    //Remove
                    case REMOVE:
                        shoppingCart.removeFromCart(terms[1]);
                        break;

                    //CHECKOUT
                    case CHECKOUT:
                        Float discount = 0f;
                        // Check if discount is applied
                        if (terms.length > 0)
                            discount = Float.parseFloat(terms[1]);
                        shoppingCart.calculate(discount);
                        stop = true;
                        break;
                        

                    default:
                        System.out.printf("Unknown command: %s\n", terms[0]);
                }
                System.out.println();
            }

            System.out.println("Thank you for shopping with us");
        }
    }
    

