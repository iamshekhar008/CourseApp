package com.springRest.CourseApp.Services;

import com.springRest.CourseApp.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//here we annotate service , as this annotate this is a service layer method
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    //Currently no DAO LAYER IMPLEMENTED SO JUST FOR LEARINING PURPOSE WE ARE MAKING LIST
    public CourseServiceImpl(){
       list = new ArrayList<>();
       list.add(new Course("This is java course",123,"JAVA COURSE"));
       list.add(new Course("This is Python Course",124,"Python - Beginer"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    public Course getCourse(long courseId){
        Course c=null;
        for(Course course:list){
            if(course.getCourseId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    public Course addCourses(Course course){
        if(!list.contains(course))
        list.add(course);
        else
            return null;

        return course;
    }

    public Course deleteCourse(long courseId){
        Course course=null;
        for(Course course1:list){
            if(course1.getCourseId()==courseId){
                course=course1;
                list.remove(course1);
                break;
            }
        }
        return course;
    }

    public Course updateCourses(Course course){
        long courseId=course.getCourseId();
        Course updatedCourse=null;
        for(Course course1:list){
            if(course1.getCourseId()==courseId){
                list.remove(course1);
                list.add(course);
                updatedCourse=course;
            }
        }
        return updatedCourse;
    }
}
