package hw_12_patterns.Ex_1;

public class ProductFilterBySellingPrice implements ProductFilteringStrategy{
    private Integer sellingPrice;

    public ProductFilterBySellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public boolean filter(Product product) {
        return this.sellingPrice.equals(product.getSellingPrice());
    }
}
