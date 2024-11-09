

public class MyFirstProgram {
    public static void main(String[] args) {

        Product product1 = new Product("Nivea Spray", "4017948013780", 15.25F);

        System.out.println(product1.getInfo());
        System.out.println("Pretul final " + product1.calculateTotalPrice());
        System.out.println();

        Chocolate milkchocolate = new Chocolate("Milka", "8017897305678", 7.5F, 100);

        System.out.println(milkchocolate.getInfo());
        System.out.println("Pretul final " + milkchocolate.calculateTotalPrice());
        System.out.println();

        Wine redwine = new Wine("Bonarda", "890123456789", 10, 0.75F);

        System.out.println(redwine.getInfo());
        System.out.println("Pretul final " + redwine.calculateTotalPrice());
        System.out.println();
    }
}