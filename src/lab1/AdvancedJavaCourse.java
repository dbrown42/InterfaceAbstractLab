package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Dallas Brown
 * @version     1.00
 */
public class AdvancedJavaCourse extends CollegeCourse{
/*
    private String courseName;
    private String courseNumber;
    private double credits;
*/
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String instructors, String prerequisites) {
        super(courseName, courseNumber, credits, instructors);
        this.setPrerequisites(prerequisites);
    }
    
    public String getPrerequisites(){
        return prerequisites;
    }
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
/*
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
*/    
}
