package com.searchmetrics.spark.spring;

import lombok.RequiredArgsConstructor;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class WordCountService {

    private final JavaSparkContext javaSparkContext;

    public Map<String, Long> getCount(List<String> words) {
        return javaSparkContext.parallelize(words).countByValue();
    }
}
