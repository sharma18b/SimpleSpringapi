package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Course;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
//import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseDao extends JpaRepository<Course , Long> {


}
