import multiply.MultiplicationTable;
import pasport.Pasport;
import pasport.PasportList;
import product.Product;
import product.ProductList;
import product.Recipe;
import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ-1.");
        Product flour = new Product("Мука", 78.98, 2);
        Product buckwheat = new Product("Греча", 65.96, 1);
        Product bread = new Product("Хлеб", 35.0, 2);
        Product milk = new Product("Молоко", 71.99, 2);
        Product meat = new Product("Мясо", 399.00, 2);
        Set<Product> products = new HashSet<>();
        products.add(flour);
        products.add(bread);
        products.add(buckwheat);
        products.add(meat);
        products.add(milk);
        System.out.println(products);

        ProductList productList = new ProductList(products);
        productList.addProduct(new Product("каша", 56.0, 3));
        productList.addProduct(new Product("банан", 76.0, 3));
//  исключение      productList.addProduct(milk);
        System.out.println(productList);

        Recipe one = new Recipe("Новый рецепт", 78.0, productList);
        Recipe two = new Recipe("Новый рецепт2", 23.0, productList);
        Recipe three = new Recipe("Новый рецепт3", 65.0, productList);
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(one);
        recipes.add(two);
        recipes.add(three);
        System.out.println(recipes.toString());


        System.out.println("ДЗ-2.2");
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(number -> number % 2 == 1);
        System.out.println(numbers);

        System.out.println("ДЗ-3.1");
        Car bmw = new Car("Z8", "BMW", 1.9, TypeOfBody.COUPE);
        Car kia = new Car("Sportage", "Kia", 1.7, TypeOfBody.STATION_WAGON);
        Car subaru = new Car("Forester", "Subaru", 1.5, TypeOfBody.HATCHBACK);

        Truck fe = new Truck("FE-G9K320", "Volvo", 8.9, LoadCapacity.N3);
        Truck fm = new Truck("FM-D8K", "Volvo", 6.0, LoadCapacity.N2);
        Truck fh = new Truck("FH-D13K", "Volvo", 12.8, LoadCapacity.N3);

        Mechanic<Car> ivan = new Mechanic<Car>("Иван Попов", "Hjpolo");
        Mechanic<Transport> vitya = new Mechanic<Transport>("Витя Иванович", "CoCoCo");
        Mechanic<Bus> pasha = new Mechanic<Bus>("Паша Валов", "GiGoPo");

        Sponsor cocaCola = new Sponsor("Coca Cola", 3345000);
        Sponsor fanta = new Sponsor("Fanta", 2890000);
        Sponsor pepsi = new Sponsor("Pepsi", 1900000);
        Sponsor pepsi1 = new Sponsor("Pepsi", 1900000);


        Car lada = new Car("Granta", "Lada", 1.6, TypeOfBody.SEDAN);
        lada.addDriver(new DriverB("Вова", true, 8, "B"));
        lada.addMechanic(ivan);
        lada.addSponsor(cocaCola, fanta);

        Truck fl = new Truck("FL-D5K", "Volvo", 2.4, LoadCapacity.N1);
        fl.addDriver(new DriverC("Жора", true, 9, "C"));
        fl.addMechanic(vitya);
        fl.addSponsor(pepsi);
        fl.addSponsor(pepsi1);

        Bus ikarus = new Bus("280", "Ikarus", 8.0, Capacity.TINY);
        ikarus.addDriver(new DriverD("Миша", true, 12, "D"));
        ikarus.addMechanic(vitya);
        ikarus.addSponsor(pepsi, cocaCola);


        List<Transport> transports = List.of(lada, fl, ikarus);
        for (Transport transport : transports) {
            printInfo(transport);
        }
        System.out.println("ДЗ-3.2");

        Set<MultiplicationTable> multiplicationTables = new HashSet<>();
        while (multiplicationTables.size() < 15) {
           MultiplicationTable multiplicationTable = new
                   MultiplicationTable(random.nextInt(8)+2, random.nextInt(8)+2);
            multiplicationTables.add(multiplicationTable);
            System.out.println(multiplicationTable);
        }

        System.out.println("ДЗ-3.3");
        Set<Pasport>pasports=new HashSet<>();
                pasports.add(new Pasport("Иван","Иванов","Иванович",
                LocalDate.now().minusYears(30),"123456"));
        PasportList pasportList = new PasportList(pasports);
        System.out.println(pasportList);
        pasportList.addPasport(new Pasport("Павел","Петров","Иванович",
                LocalDate.now().minusYears(25),"123456"));
        System.out.println(pasportList);

    }
    public static void printInfo(Transport transport) {
        System.out.println("Инфо по авто "+transport.getBrand()+" "+transport.getModel());
        System.out.println("Водитель: "+transport.getDrivers());
        System.out.println("Механик: "+transport.getMechanics());
        System.out.println("Спонсоры: "+transport.getSponsors());
        System.out.println();

    }




}