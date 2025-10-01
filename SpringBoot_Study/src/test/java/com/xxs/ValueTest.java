package com.xxs;

import com.xxs.Service.ValueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ValueTest {

    @Test
    public void testValueService(@Autowired ValueService valueService) {
        System.out.println(valueService);
    }
}
