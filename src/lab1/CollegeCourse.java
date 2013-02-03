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
    private String prerequisites;
    private double credits;
    
    public CollegeCourse(String courseName, String courseNumber, double credits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
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
    
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    public String getLowerCaseCourseName(){
        return this.getCourseName().toLowerCase();
    }    
    public abstract void setPrerequisites(String prerequisites);
    public abstract String getPrerequisites();
}
