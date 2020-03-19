package com.wdbyte.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>
 *
 * @author niujinpeng
 * @Date 2020/3/17 22:21
 */
@Data
public class Product {
    /** 商品名称. */
    private String productName;
    /** 商品价格. */
    private BigDecimal productPrice;
    /** 商品库存。 */
    private int productStock;
}
