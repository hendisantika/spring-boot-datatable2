package com.hendisantika.springbootdatatable2.service;

import com.hendisantika.springbootdatatable2.entity.Product;
import com.hendisantika.springbootdatatable2.exception.ResourceNotFoundException;
import com.hendisantika.springbootdatatable2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product Id Not Found " + id));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public void deleteInBatch(Long[] ids) {
        List<Product> list = productRepository.findByIdIn(ids);
        productRepository.deleteAllInBatch(list);
    }
}
