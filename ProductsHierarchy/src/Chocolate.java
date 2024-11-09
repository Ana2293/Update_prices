public class Chocolate extends Product {

    private float weight;

    public Chocolate(String name, String barcode, float basePrice, float weight) {
        super(name, barcode, basePrice);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Weight: " + weight;
    }
}
