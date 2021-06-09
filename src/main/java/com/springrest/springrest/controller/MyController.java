package com.springrest.springrest.controller;

//import org.springframework.stereotype.Controller;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController{
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    // some extra from
    @GetMapping("/")
    public String home1()
    {
        String str
                = "<html><body><font color=\"green\">"
                + "<h1>WELCOME</h1>"
                + this.courseService.getCourses().toString()
                + "</font></body></html>";
        return str;
    }

    // Another syntax to implement a
    // GET method
    @RequestMapping(
            method = { RequestMethod.GET },
            value = { "/gfg" })

    public String info()
    {
        String str2
                = "<html><body><font color=\"green\">"
                + "<h2>Hello I am testing this Application"
                + "</h2></font></body></html>";
        return str2;
    }
}
