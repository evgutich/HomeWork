package hw_12_patterns.Ex_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("samsung", 700, 500),
                new Product("nokia", 500, 250), new Product("samsung", 1000, 500),
                new Product("apple", 700, 250), new Product("huawei", 700, 500)));

        ProductService service = new ProductService(products);

        System.out.println(service.filter(new ProductFilterByName("samsung")));
        System.out.println(service.filter(new ProductFilterByListPrice(700)));
        System.out.println(service.filter(new ProductFilterBySellingPrice(500)));
    }
}
