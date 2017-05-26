package rs.aleph.android.example22.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example22.model.Category;

public class CategoryProvider {

    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Fruit"));
        categories.add(new Category(1, "Vegetable"));
        return categories;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Fruit");
            case 1:
                return new Category(1, "Vegetable");
            default:
                return null;
        }
    }
}
