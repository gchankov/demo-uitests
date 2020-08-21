package utils;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class HtmlTable {

    public static List<Product> toProducts(SelenideElement htmlTable) {
        ElementsCollection productsTableRows = htmlTable.$$("tr");
        List<Product> products = new ArrayList<Product>();

        for(int i = 1; i < productsTableRows.size(); i++) {
            ElementsCollection rowEntries = productsTableRows.get(i).$$("td");
            Product product = new Product();
            product.setId(rowEntries.get(0).getText());
            product.setName(rowEntries.get(1).getText());
            products.add(product);
        }

        return products;
    }
}
