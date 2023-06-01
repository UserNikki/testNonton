package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ProductsImpl {
    private final Map<String,Product> productStorage = new HashMap<>();

    boolean addProduct(Product product) {
        if (productStorage.containsKey(product.getId())) {
            return false;
        }
        productStorage.put(product.getId(),product);
        return productStorage.containsValue(product);
    }

    boolean deleteProduct(Product product) {
        if (productStorage.containsKey(product.getId())) {
            return productStorage.remove(product.getId(),product);
        }
        return false;
    }

    String getName(String id) {
        if (productStorage.containsKey(id)) {
            return productStorage.get(id).getName();
        }
        return "";
    }

    List<String> findByName(String name) {
        return productStorage.values().stream()
                .filter(v -> v.getName().equals(name))
                .map((Product::getId)).collect(Collectors.toList());
    }

    void toConsole() {//создал для удобства теста
        productStorage.values().forEach(System.out::println);
    }
}
