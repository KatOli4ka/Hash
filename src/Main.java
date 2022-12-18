import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1.");
        Product flour = new Product("Мука", 78.98, 2);
        Product buckwheat = new Product("Греча", 65.96, 1);
        Product bread = new Product("Хлеб", 35.0, 2);
        Product milk = new Product("Молоко", 71.99, 2);
        Product meat = new Product("Мясо", 399.00, 2);
        Set<Product>products=new HashSet<>();
        products.add(flour);
        products.add(bread);
        products.add(buckwheat);
        products.add(meat);
        products.add(milk);
        System.out.println(products);

        ProductList productList=new ProductList(products);
        productList.addProduct(new Product("каша",56.0,3));
        productList.addProduct(new Product("банан",76.0,3));
        System.out.println(productList);

        Recipe one=new Recipe("Новый рецепт",78.0,productList);
        Recipe two=new Recipe("Новый рецепт2",23.0,productList);
        Recipe three=new Recipe("Новый рецепт3",65.0,productList);
        Set<Recipe>recipes=new HashSet<>();
        recipes.add(one);
        recipes.add(two);
        recipes.add(three);
        System.out.println(recipes.toString());


        System.out.println("ДЗ-2.2");
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