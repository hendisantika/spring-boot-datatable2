package com.hendisantika.springbootdatatable2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/07/21
 * Time: 14.42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @Id
    private Long id;

    private String name;

    private BigDecimal price;

    private String productId;

    private Integer version;
}
