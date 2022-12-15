package MyProg;

public class Item1 {
    private String name;
    private String code;
    private Float price = 0f;
    private Integer quantity = 0;


    public Item1(String name, String code) {
        this.name = name.toUpperCase();
        this.code = code.toUpperCase();
    }

    public Float totalPrice(){
        return this.price * this.quantity;
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

   

    

    
}
