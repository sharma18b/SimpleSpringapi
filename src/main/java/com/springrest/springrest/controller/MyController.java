package com.springrest.springrest.controller;

//import org.springframework.stereotype.Controller;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Product;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
public class MyController{
    @Autowired
    private CourseService courseService;


    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.courseService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable String productId){
        return this.courseService.getProduct(Integer.parseInt(productId));
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        return this.courseService.addProduct(product);
    }
    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
    // get the courses
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }
    // get a specific course
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    // add a new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

    // some extra from
    @GetMapping("/")
    public @ResponseBody String greeting() {
        return this.courseService.getWelcomeMessage();
    }

    // update details of a specific course
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.courseService.updateCourse(course);

    }

    // delete a course
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        // tried to learn new approach sending exceptions
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    // Another syntax to implement a
    // GET method
    @RequestMapping(
            method = { RequestMethod.GET },
            value = { "/msg" })

    public String info()
    {
        String str2
                = "<html><body><font color=\"green\">"
                + "<h2>Hello I am testing this Application"
                + "</h2></font></body></html>";
        return str2;
    }
}
