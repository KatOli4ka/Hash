import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products;

    public ProductList(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Такой продукт уже есть в списке!");
        }
        products.add(product);
    }
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "Список продуктов: " + products;
    }
}
