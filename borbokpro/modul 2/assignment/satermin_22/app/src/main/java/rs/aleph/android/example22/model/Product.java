package rs.aleph.android.example22.model;

public class Product {

    private int id;
    private String name;
    private String description;
    private float rating;
    private String image;
    private Category category;

    public Product() {

    }

    public Product(int id, String name, String description, float rating, Category category, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
