package com.hendisantika.springbootdatatable2.service;

import com.hendisantika.springbootdatatable2.entity.Product;
import com.hendisantika.springbootdatatable2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 06.00
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
