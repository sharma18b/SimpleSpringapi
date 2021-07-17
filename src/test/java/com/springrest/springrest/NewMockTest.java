package com.springrest.springrest;
import java.util.*;
import com.springrest.springrest.controller.MyController;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class NewMockTest {
    @Mock
    private CourseService helloService;

    @InjectMocks
    private MyController helloController;

    @Before
    public void play()
    {
        System.out.println("Before the test");
    }
    @Test
    public void getCoursebyIdTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void getProductbyIdTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void getALLProductsTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void getAllCourses() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void deleteProductTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void deleteCourseTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @Test
    public void addProductTest() {
        long courseId = 1;
        when(helloService.getCourse(courseId))
                .thenReturn((new Course(1, "this is a new datasource string", "lol this works")));
        assertEquals("this is a new datasource string", helloService.getCourse(courseId).getTitle());
    }
    @After
    public void play1()
    {
        System.out.println("After the test");
    }

}
