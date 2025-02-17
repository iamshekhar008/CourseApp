package com.springRest.CourseApp.Entities;

public class Course {
    private long courseId;
    private String title;
    private String descirption;

    public Course(String descirption, long courseId, String title) {
        this.descirption = descirption;
        this.courseId = courseId;
        this.title = title;
    }

    public long getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", title='" + title + '\'' +
                ", descirption='" + descirption + '\'' +
                '}';
    }
}
