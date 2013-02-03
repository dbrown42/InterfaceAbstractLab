package lab3;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 * I must declare all appropriate properties and then override all of the abstract methods in the super-interface-class.
 *
 * @author      Dallas Brown
 * @version     1.00
 */
import javax.swing.JOptionPane;
public class AdvancedJavaCourse extends ITCollegeCourse{
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
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
}
