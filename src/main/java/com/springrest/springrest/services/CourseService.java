package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Product;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public List<Product> getProducts();
    Course getCourse(long parseLong);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long parseLong);

    String getWelcomeMessage();
}
