package com.fyh.ssb;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest
public class PropertiesTest {
    @Value("${fyh.name}")
    private String name;

    @Test
    public void testSingle(){
        System.out.println(name);
    }
}
