/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Dallas
 */
public interface CollegeCourse {
    
    public abstract String getCourseNumber();
    
    public String getCourseName();
    
    public double getCredits();
    
    public abstract String getPrerequisites();
    
    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);
    
    public abstract void setCredits(double credits);
    
    public abstract void setPrerequisites(String prerequisites);    
}
