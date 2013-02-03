package lab3;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * I must declare all appropriate properties and then override all of the abstract methods in the super-interface-class.
 *
 * @author      Dallas Brown
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ITCollegeCourse{
    private final String prerequisites = "NO PREREQUISITES!";

    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }
    
    //I declared this setter as a final because there is a very low chance that this course will ever have prerequisites
    public final void setPrerequisites(String prerequisites){
        JOptionPane.showMessageDialog(null, "You cannot enter - " + prerequisites + " - as a prerequisite(s) for this course because it has no prerequisites.");
    }
    public String getPrerequisites(){
        return prerequisites;
    }
}
