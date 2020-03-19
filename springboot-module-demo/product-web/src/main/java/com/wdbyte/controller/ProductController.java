package com.wdbyte.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.wdbyte.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * @author niujinpeng
 * @Date 2020/3/17 22:23
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * 获取商品列表
     * 
     * @return
     */
    @GetMapping("/list")
    public Map list() {
        // 模拟查询逻辑
        Product product = new Product();
        product.setProductName("小米粥");
        product.setProductPrice(new BigDecimal(2.0));
        product.setProductStock(100);

        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", 000);
        resultMap.put("message", "成功");
        resultMap.put("data", Arrays.asList(product));
        return resultMap;
    }
}
