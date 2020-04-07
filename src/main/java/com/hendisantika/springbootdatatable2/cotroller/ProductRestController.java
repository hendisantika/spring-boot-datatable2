package com.hendisantika.springbootdatatable2.cotroller;

import com.hendisantika.springbootdatatable2.entity.Product;
import com.hendisantika.springbootdatatable2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 06.02
 */
@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/api/products")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path = "/api/products/{id}")
    public Product getProductById(@PathVariable("id") Integer id) {
        return productService.getProductById(id);
    }
}
