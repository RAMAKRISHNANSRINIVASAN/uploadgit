package suguestream;

public class Product {

    private int code;
    private Double price;
    private String name;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(int code, Double price, String name) {
        this.code = code;
        this.price = price;
        this.name = name;
    }

    // Getter for code
    public int getCode() {
        return code;
    }

    // Setter for code
    public void setCode(int code) {
        this.code = code;
    }

    // Getter for price
    public Double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [code=" + code + ", price=" + price + ", name=" + name + "]";
    }
}
