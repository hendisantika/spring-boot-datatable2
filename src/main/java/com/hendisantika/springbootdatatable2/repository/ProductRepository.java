package com.hendisantika.springbootdatatable2.repository;

import com.hendisantika.springbootdatatable2.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 05.59
 */
@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
