package com.hendisantika.springbootdatatable2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatable2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/07/21
 * Time: 16.31
 */
@Controller
public class IndexController {
    @GetMapping
    @ResponseBody
    public String index() {
        return "Spring Boot DataTable! " + LocalDateTime.now();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
