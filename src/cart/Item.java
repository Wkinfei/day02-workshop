package cart;

public class Item{
    //members
    private String name;
    private String code;
    // Float and Integer need to initialize
    private Float price = 0f;
    private Integer quantity = 0;

    // Need to give the code and name in order for the method to work.
    public Item(String code, String name){
        this.code = code;
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Calculate the total price.
    public Float totalPrice(){
        return this.price * this.quantity;
    }

    
}