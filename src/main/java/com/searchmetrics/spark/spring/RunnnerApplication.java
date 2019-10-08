package com.searchmetrics.spark.spring;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
@Slf4j
public class RunnnerApplication implements CommandLineRunner {

    private final WordCountService wordCountService;

    @Override
    public void run(String... args) throws Exception {

        List<String> words = Arrays.asList("hello", "world");

        Map<String, Long> count = wordCountService.getCount(words);

        log.info("Here is the count \n\n {}", count.toString());
    }
}