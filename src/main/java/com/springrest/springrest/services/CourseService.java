package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Product;

import java.util.List;

public interface CourseService {


    public List<Product> getProducts();

    public Product getProduct(int productId);

    public List<Course> getCourses();

    Course getCourse(long parseLong);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parseLong);

    String getWelcomeMessage();

    Product addProduct(Product product);
}
