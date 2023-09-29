package com.snow.xxjy.product;

import com.snow.xxjy.product.entity.BrandEntity;
import com.snow.xxjy.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XxjyProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("测试");
        boolean save = brandService.save(brandEntity);
        System.out.println(save);
    }

}
