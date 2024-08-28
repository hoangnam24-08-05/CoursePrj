/*
 * @ (#) CourseList.java       1.0        8/28/2024
 *
 *Copyright (c) 2024 IUH. ALL rights reserved
 */
package edu.iuh.fit;


/*
 * @description:btvn
 * @author:tran hoang nam
 * @version:    1.0
 * @created:    8/28/2024
 */


public class CourseList {
    private Course[] courses;
    private static int count = 0;


    public CourseList(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Length of the array must be greater than 0");
        courses = new Course[n]; // create an array of n elements
    }


    public boolean addCourse(Course course) {
        //  check if course is null
        if(course == null)
            return false;
        //  check if course already exists
        if(exists(course)) //Check if id of course duplicate
            return false;
        //  check if the array is full
        if (count == courses.length)
            return false;
        //  add course to the array
        courses[count++] = course;
        return true;
    }

    private boolean exists(Course course) {
        for (int i = 0; i < count; i++) {
            if (courses[i] != null && courses[i].getId().equalsIgnoreCase(course.getId()))
                return true;
        }
        return false;
    }

    public Course[] getCourses() {
        return courses;
    }
}
