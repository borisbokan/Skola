package rs.aleph.android.example22.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example22.model.Category;
import rs.aleph.android.example22.model.Product;

public class ProductProvider {

    public static List<Product> getProducts() {
        Category fruit = new Category(0, "Fruit");

        List<Product> products = new ArrayList<>();
        products.add(new Product(0, "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, fruit, "apples.jpg"));
        products.add(new Product(1, "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 4.0f, fruit, "oranges.jpg"));
        products.add(new Product(2, "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 3.0f, fruit, "bananas.jpg"));
        return products;
    }

    public static Product getProductById(int id) {
        Category fruit = new Category(0, "Fruit");

        switch (id) {
            case 0:
                return new Product(0, "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, fruit, "apples.jpg");
            case 1:
                return new Product(1, "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 4.0f, fruit, "oranges.jpg");
            case 2:
                return new Product(2, "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 3.0f, fruit, "bananas.jpg");
            default:
                return null;
        }
    }
}
