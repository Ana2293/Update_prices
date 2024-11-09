public class Product {

    protected String name;
    protected String barcode;
    protected float basePrice;
    private final static float TAX = 0.2F;

    public Product() {
        name = "unknown";
        barcode = "default";
    }

    public Product(String name, String barcode, float basePrice) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
    }

    public float calculateTotalPrice() {

        return basePrice * (this.TAX + 1);
    }

    public String getInfo() {
        return "Name: " + this.name + "\n" +
                "Barcode: " + this.barcode + "\n" +
                "Base price: " + this.basePrice + "\n" +
                "Total price: " + this.calculateTotalPrice();
    }
}
