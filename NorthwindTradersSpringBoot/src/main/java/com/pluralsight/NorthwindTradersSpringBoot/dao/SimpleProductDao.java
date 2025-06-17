package com.pluralsight.NorthwindTradersSpringBoot.dao;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SimpleProductDao implements ProductDao{
    private List<Product> products = new ArrayList<>();
    private int lastProductId = 4;

    public SimpleProductDao(){
        products.add(new Product(1, "Coffee", "Beverage", 6));
        products.add(new Product(2, "Monster", "Beverage", 3));
        products.add(new Product(3, "Smoothie", "Beverage", 7));
        products.add(new Product(4, "Milk", "Beverage", 1));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product add(Product product) {
        if (product.getProductId() == 0){
            product.setProductId(lastProductId + 1);
            lastProductId++;
        }
        products.add(product);
        return product;
    }
}
