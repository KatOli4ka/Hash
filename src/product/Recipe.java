package product;

import java.util.Objects;

public class Recipe {
    private String name;
    private double totalCost;
    private ProductList productList;



    public Recipe(String name, double totalCost, ProductList productList) {
        this.name = name;
        this.totalCost = totalCost;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт - " + name + '\'' +
                ", полная стоимость - " + totalCost +
                ", список продуктов - " + productList +
                '}';
    }
}
