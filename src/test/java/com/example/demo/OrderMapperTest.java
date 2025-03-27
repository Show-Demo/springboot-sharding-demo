package com.example.demo;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@Slf4j
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    // 用于解析日期字符串
    private Date parse(String dateStr) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testInsert() {
        // 示例：插入订单，偶数使用2025-01-15，奇数使用2025-02-15
        for (long i = 0; i < 12; i++) {
            Date createTime = (i % 2 == 0) ? parse("2025-01-15") : parse("2025-02-15");
            Order order = new Order(null, i + 200, 1L, new BigDecimal(200 + i), 1, createTime);
            orderMapper.insert(order);
        }
        log.info("订单插入完成！");
    }
}