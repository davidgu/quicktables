/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicktables;
import java.io.*;

/**
 *
 * @author David
 */
public class Course implements Serializable{
    
    private String courseCode;
    private String courseName;
    private String room;
    private String teacher;
    
    Course(String courseCode, String courseName, String room, String teacher){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.room = room;
        this.teacher = teacher;
    }
    
    String getCourseCode(){
        return courseCode;
    }
    
    String getCourseName(){
        return courseName;
    }
    
    String getRoom(){
        return courseCode;
    }
    
    String getTeacher(){
        return courseCode;
    }
}
