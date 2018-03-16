import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {

        // Product eggs = Product.newBuilder().setName("eggs").setCarbs(0.6).setFat(8.4).setProteins(11.1).build();

//        Set<Integer> set = new HashSet<Integer>();
//        set.add(new Integer(1000000));
//        assertTrue(set.contains( new Integer(1000000)));


        Integer a = new Integer(1000000);
        Integer b = new Integer(1000000);
        assertTrue(a.equals(b));
    }
}
