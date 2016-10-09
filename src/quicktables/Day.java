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
public class Day implements Serializable {
    
    private Course[] course = new Course[6];
    
    Day(Course homeroom, Course course1, Course course2, Course course3, Course course4, Course course5){
        this.course[0]=homeroom;
        this.course[0]=course1;
        this.course[0]=course2;
        this.course[0]=course3;
        this.course[0]=course4;
        this.course[0]=course5;
    }
    
    Course getCourse(int i){
        return course[i];
    }
}
