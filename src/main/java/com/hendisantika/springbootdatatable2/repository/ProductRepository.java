package com.hendisantika.springbootdatatable2.repository;

import com.hendisantika.springbootdatatable2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/04/20
 * Time: 05.59
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByIdIn(Long[] id);
}
