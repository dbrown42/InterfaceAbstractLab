/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dallas
 */
public abstract class CollegeCourse {
    private String courseNumber, courseName;
    private double credits;
    private String instructors;
    
    public CollegeCourse(String courseName, String courseNumber, double credits, String instructors){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setInstructors(instructors);
    }
    
    public String getCourseNumber(){
        return this.courseNumber;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public double getCredits(){
        return this.credits;
    }
    
    public String getInstructors() {
        return instructors;
    }
    
    //I kept the following 3 methods final because it does not seem to effect the program during run-time.
    //However, I am not quite sure whether it is the proper way to declare these types of methods or not.
    //It still allows me to use these final setter methods to modify their properties.
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public final void setInstructors(String instructors) {
        if(instructors == null || instructors.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: instructors cannot be null of empty string");
            System.exit(0);
        }
        this.instructors = instructors;
    }
    
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
}
