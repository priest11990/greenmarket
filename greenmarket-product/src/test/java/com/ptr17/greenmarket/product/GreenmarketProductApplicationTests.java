package com.ptr17.greenmarket.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ptr17.greenmarket.Product.entity.BrandEntity;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GreenmarketProductApplicationTests {

    @Autowired
    com.ptr17.greenmarket.Product.service.BrandService brandService;

    @Test
    void contextLoads() {
        // BrandEntity brandEntity = new BrandEntity();
        // brandEntity.setBrandId(1L);
        // brandEntity.setDescript("huawei");
        // brandEntity.setName("huawei");
        // brandService.save(brandEntity);
        // System.out.println("Saved Success...");

        // brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });

    }
}