package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      Dallas Brown
 * @version     1.00
 */
public class IntroToProgrammingCourse extends CollegeCourse{
/*
    private String courseName;
    private String courseNumber;
    private double credits;
*/
    private final String prerequisites = "NO PREREQUISITES!";

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits, String instructors) {
        super(courseName, courseNumber, credits, instructors);
    }
    
    //I declared this setter as a final because there is a very low chance that this course will ever have prerequisites
    public final void setPrerequisites(String prerequisites){
        JOptionPane.showMessageDialog(null, "You cannot enter - " + prerequisites + " - as a prerequisite(s) for this course because it has no prerequisites.");
    }
    public String getPrerequisites(){
        return prerequisites;
    }
/*
    public String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
*/
}
