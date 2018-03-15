import domain.Product;

public class Main {
    public static void main(String[] args) {

        Product eggs = Product.newBuilder().setName("eggs").setCarbs(0.6).setFat(8.4).setProteins(11.1).build();


    }
}
