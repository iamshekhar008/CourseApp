package com.springRest.CourseApp.RestController;


import com.springRest.CourseApp.Entities.Course;
import com.springRest.CourseApp.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    //Now we are doing dependency injection this is for loose coupling
    @Autowired
    private CourseService courseService;


    @GetMapping("/Home")
    public String home(){
        return "Welcome to Home buddy!!\nThis is a My Course Application";
    }

    //Get List of Courses
    @GetMapping("/Courses")
    public List<Course> getCourses(){
       return this.courseService.getCourses();
    }

    //Get Course by course Id
    @GetMapping("/Courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    //Add a Single Course
    @PostMapping("/Courses")
    public Course addCourse(@RequestBody Course course){
       return this.courseService.addCourses(course);
    }


    //Deleting Course by course Id
    @DeleteMapping("/Courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCoursebyId(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
              return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/Courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourses(course);
    }
}
