package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_order")
public class Order {
    @TableId(type = IdType.ASSIGN_ID)
    private Long orderId;
    private Long userId;
    private Long merchantId;
    private BigDecimal amount;
    private Integer orderStatusId;
    private Date createTime;
}
