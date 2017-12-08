package modeling.checkpoint5;

import java.util.ArrayList;
import java.util.List;

class Student {

    List<Course> courses = new ArrayList<Course>();

    public void registerCourse(Course course){
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
