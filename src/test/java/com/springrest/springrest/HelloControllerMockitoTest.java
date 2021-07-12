package com.springrest.springrest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.springrest.springrest.controller.MyController;
import com.springrest.springrest.services.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class HelloControllerMockitoTest {

    @Mock
    private CourseService helloService;

    @InjectMocks
    private MyController helloController;

    @BeforeEach
    void setMockOutput() {
        when(helloService.getWelcomeMessage()).thenReturn("Hello World!");
    }

    @Test
    public void shouldReturnDefaultMessage() {
        String response = helloController.greeting();
        assertThat(response).isEqualTo("Hello World!");
    }
}