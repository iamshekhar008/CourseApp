package com.springRest.CourseApp.Services;

import com.springRest.CourseApp.Entities.Course;

import java.util.List;
//Doing this so that we are having a loose coupling
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourses(Course course);
    public Course deleteCourse(long courseId);
    public Course updateCourses(Course course);
}
