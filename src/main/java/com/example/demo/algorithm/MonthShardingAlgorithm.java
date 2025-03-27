package com.example.demo.algorithm;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class MonthShardingAlgorithm implements PreciseShardingAlgorithm<Date> {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");

    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> shardingValue) {
        String suffix = sdf.format(shardingValue.getValue()); // 确保是 yyyyMM 格式
        for (String tableName : availableTargetNames) {
            if (tableName.endsWith(suffix)) {
                return tableName;
            }
        }
        throw new IllegalArgumentException("No table found for date: " + shardingValue.getValue());
    }
}
