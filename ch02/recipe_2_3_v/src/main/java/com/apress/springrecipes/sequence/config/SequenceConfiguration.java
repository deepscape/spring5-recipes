package com.apress.springrecipes.sequence.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.apress.springrecipes.sequence.SequenceGenerator;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = {"com.apress.springrecipes.sequence.*"})
        }
)
public class SequenceConfiguration {
    @Bean
    public SequenceGenerator sequenceGenerator() {
        SequenceGenerator sequence = new SequenceGenerator();
        sequence.setInitial(100000);
        sequence.setSuffix("A");
        return sequence;
    }
}
