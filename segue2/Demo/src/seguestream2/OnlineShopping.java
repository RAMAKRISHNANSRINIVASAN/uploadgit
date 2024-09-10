package seguestream2;


public class OnlineShopping {
    private int code;
    private String name;
    private int price;
    private int qty;

    public OnlineShopping(int code, String name, int price, int qty) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OnlineShopping [code=" + code + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
    }
}
