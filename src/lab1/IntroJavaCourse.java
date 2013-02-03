package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      Dallas Brown
 * @version     1.00
 */
import javax.swing.JOptionPane;
public class IntroJavaCourse extends CollegeCourse{
/*
    private String courseName;
    private String courseNumber;
    private double credits;
*/
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String instructors, String prerequisites) {
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
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }
   
    public void setCredits(double credits) {
        //Original: "if(credits < 0 || credits > 5)" does not correctly correspond with the problem domain.
        if(credits < 0.5 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
*/
}
