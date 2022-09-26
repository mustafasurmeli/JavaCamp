public class Product {

    public Product(int id,String name, String description,double price, int stockAmount, String color){
        System.out.println("Constructor Block Worked");
        this.id = id;
        this.color = color;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }

    public Product(){

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String kod;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRenk() {
        return color;
    }

    public void setRenk(String renk) {
        this.color = renk;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
