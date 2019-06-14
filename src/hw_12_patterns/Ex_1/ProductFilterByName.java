package hw_12_patterns.Ex_1;

public class ProductFilterByName implements ProductFilteringStrategy {
    private final String name;

    public ProductFilterByName(String name) {
        this.name = name;
    }

    @Override
    public boolean filter(Product product) {
        return this.name.equals(product.getName());
    }
}
