package hw_12_patterns.Ex_1;

public class ProductFilterByListPrice implements ProductFilteringStrategy {
    private Integer listPrice;

    public ProductFilterByListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public boolean filter(Product product) {
        return this.listPrice.equals(product.getListPrice());
    }
}
