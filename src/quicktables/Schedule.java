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
public class Schedule implements Serializable{
    
    private Day day[] = new Day[8];
    private String nameAndGrade;
    private String schoolAndYear;
    
    Schedule(String nameAndGrade, String schoolAndYear, Day day1, Day day2, Day day3, Day day4, Day day5, Day day6, Day day7, Day day8){
        this.nameAndGrade=nameAndGrade;
        this.schoolAndYear=schoolAndYear;
        this.day[0]=day1;
        this.day[1]=day2;
        this.day[2]=day3;
        this.day[3]=day4;
        this.day[4]=day5;
        this.day[5]=day6;
        this.day[6]=day7;
        this.day[7]=day8;
    }
}