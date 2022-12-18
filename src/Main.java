import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1.");
//        Product product = new Product("Мука", 78.98, 2);
//        Product product1 = new Product("Греча", 65.96, 1);
//        Product product2 = new Product("Хлеб", 35.0, 2);
//        Product product3 = new Product("Молоко", 71.99, 2);
//        Product product4 = new Product("Мясо", 399.00, 2);
//
//        Set<Product>products=new HashSet<>();
//        products.add(new Product("Каша",29.90,4));
//        products.add(new Product("Каша",29.90,4));
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);
//        products.add(product4);
//        System.out.println(Arrays.toString(products.toArray()));

        Random random=new Random();
        Set<Integer>numbers=new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator=numbers.iterator();
        while (iterator.hasNext()) {
            Integer number=iterator.next();
            if (number % 2 == 1) {
                iterator.remove();
            }
        }
        System.out.println(numbers);


    }
}