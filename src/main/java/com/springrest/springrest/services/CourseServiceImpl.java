package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    // old way
    //public List<Course> list;
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145,"Plural Sight Java","this is a simple test course"));
//        list.add(new Course(146,"PluralSight Spring Boot  Java","this is another simple test course"));

    }
    @Override
    public List<Course> getCourses() {

        //return list;
        return courseDao.findAll();
    }
    @Override
    public Course getCourse(long courseId){
//        Course c = null;
//        for (Course course : list)
//        {
//            if (course.getId() == courseId)
//            {
//                c = course;
//                break;
//            }
//        }
//        return c;
        return courseDao.getOne(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        //list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e -> {
//            if (e.getId() == course.getId())
//            {
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
        //list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
    }
}
