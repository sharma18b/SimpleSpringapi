package testingweb;

import com.springrest.springrest.controller.MyController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class SmokeTest {
    @Autowired
    private MyController controller;

    @Test
    public void contextLoads() throws Exception {

        assertThat(controller).isNotNull();
    }

}
