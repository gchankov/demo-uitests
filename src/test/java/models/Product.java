package models;

import java.util.Map;

public class Product {

    private String id;
    private String name;

    public static Product createProduct(Map<String, String> entry) {
        Product product = new Product();
        product.setId(entry.get("id"));
        product.setName(entry.get("name"));
        return product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
