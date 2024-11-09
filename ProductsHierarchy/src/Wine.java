public class Wine extends Product{

    private float volume;
    private static final float WINE_TAX = 0.1F;

    public Wine(String name, String barcode, float basePrice, float volume) {
        super(name, barcode, basePrice);
        this.volume = volume;
    }

    @Override
    public float calculateTotalPrice() {
        return super.calculateTotalPrice() + super.calculateTotalPrice() * WINE_TAX;
    }

    @Override
    public String getInfo() {
        return  super.getInfo() + "\n" +
                "Volume: " + volume;
    }
}
