/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Dallas
 */
import javax.swing.JOptionPane;
public class AbstractTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CollegeCourse introToProgrammingCourse = new IntroToProgrammingCourse("Introduction to Programming", "152-107",  2.0, "Helen Smith");
        CollegeCourse introJavaCourse = new IntroJavaCourse("Java Programming", "152-134", 4.0, "Matt Green", "152-107 Introduction to Programming or 152-106 Basic Programming/Logic");
        CollegeCourse advancedJavaCourse = new AdvancedJavaCourse("Advanced Java Programming", "152-135", 4.0, "James Lumbardo", "152-134 Java Programming");
        JOptionPane.showMessageDialog(null, "introToProgrammingCourse; Name: " + introToProgrammingCourse.getCourseName() + 
                " / Number: " + introToProgrammingCourse.getCourseNumber() + 
                " / Credits: " + introToProgrammingCourse.getCredits() +
                " / Instructor(s): " + introToProgrammingCourse.getInstructors() +
                " / Prerequisites: " + introToProgrammingCourse.getPrerequisites() + ".");
        JOptionPane.showMessageDialog(null, "introJavaCourse; Name: " + introJavaCourse.getCourseName() + 
                " / Number: " + introJavaCourse.getCourseNumber() + 
                " / Credits: " + introJavaCourse.getCredits() +
                " / Instructor(s): " + introJavaCourse.getInstructors() +
                " / Prerequisites: " + introJavaCourse.getPrerequisites() + ".");
        JOptionPane.showMessageDialog(null, "advancedJavaCourse; Name: " + advancedJavaCourse.getCourseName() + 
                " / Number: " + advancedJavaCourse.getCourseNumber() + 
                " / Credits: " + advancedJavaCourse.getCredits() +
                " / Instructor(s): " + advancedJavaCourse.getInstructors() + 
                " / Prerequisites: " + advancedJavaCourse.getPrerequisites() + ".");
        introToProgrammingCourse.setCourseName("introToProgrammingName");
        introToProgrammingCourse.setPrerequisites("Anyhting.");
        introJavaCourse.setCredits(2.0);
        advancedJavaCourse.setCredits(2.0);
        JOptionPane.showMessageDialog(null, "introToProgrammingCourse prerequisites (changed): " + introToProgrammingCourse.getPrerequisites() + 
                " / introJavaCourse credits (changed): " + introJavaCourse.getCredits() + 
                " / advancedJavaCourse credits (changed): " + advancedJavaCourse.getCredits() + 
                " / introToProgrammingCourse name (changed): " + introToProgrammingCourse.getCourseName());
    }
}
