package com.fj;

import com.fj.dao.ProductCategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author fengj
 * @date 2019/12/7 -21:53
 */

@SpringBootApplication
public class SellApplication {


    public static void main(String[] args) {

        SpringApplication.run(SellApplication.class,args);
    }

}