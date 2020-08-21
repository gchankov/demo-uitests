package steps.configurer;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import models.Product;

import java.util.Locale;
import java.util.Map;

public class Configurer implements TypeRegistryConfigurer {

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(Product.class, new TableEntryTransformer<Product>() {
            @Override
            public Product transform(Map<String, String> entry) {
                return Product.createProduct(entry);
            }
        }));
    }

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }
}
