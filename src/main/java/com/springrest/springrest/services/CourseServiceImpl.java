package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    // old way
    //public List<Course> list;
    @Autowired
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
    @Bean
    public DataSource getDataSource() {
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "1904";
        DataSource dataSource = new DriverManagerDataSource(url,username,password);
        return dataSource;
    }

    private CourseDao courseDao;
    private final String SQL_FIND_COURSE = "select * from course where id = ?";
    private final String SQL_DELETE_COURSE = "delete from course where id = ?";
    private final String SQL_UPDATE_COURSE = "update course set title = ?, description = ?, age  = ? where id = ?";
    private final String SQL_INSERT_COURSE = "insert into course(id, title, description) values(?,?,?)";


    public CourseServiceImpl(){
    }

    @Override
    public List<Course> getCourses() {
        String sql = "select * from course";
        List<Course> courses = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Course.class));
        return courses;
    }

    @Override
    public List<Product> getProducts() {
        String sql = "select * from product";
        List<Product> products = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Product.class));
        return products;
    }

    @Override
    public Course getCourse(long courseId){
        String sql = "select * from course where id = ?";
        return (Course) jdbcTemplate.queryForObject(sql,new Object[]{courseId},new BeanPropertyRowMapper<>(Course.class));
    }

    @Override
    public Course addCourse(Course course) {
        String sql = "insert into course(id, title, description) values(?,?,?)";
        jdbcTemplate.update(sql,course.getId(),course.getTitle(),course.getDescription());
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        String sql = "update course set title = ?, description = ? where id = ?";
        jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getId());
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        String sql = "delete from course where id = ?";
        jdbcTemplate.update(sql,parseLong);
    }
    @Override
    public String getWelcomeMessage() {
        return "Hello World!";
    }
}
