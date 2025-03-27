package com.example.demo;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
@Slf4j
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        for (long i = 0; i < 12; i++) {
            Order order = new Order(null, i + 200, 1L, new BigDecimal(200 + i), 1);
            orderMapper.insert(order);
        }
        log.info("插入完成！");
    }
}