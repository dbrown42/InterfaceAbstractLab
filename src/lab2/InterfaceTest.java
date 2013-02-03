/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Dallas
 */
import javax.swing.JOptionPane;
public class InterfaceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //I'm not 100% sure,but I think one of the only ways the Liskov Substitution principle can be implamented
        //is if you creat an abstract class under the inferface superclass (an abstract superclass to the 3 sub-classes).
        //If I don't implememnt it right a way, a good example of a class for this purpose may be a "ITCourse" abstract class.
        //The ITCourse class would implement the CollegeCourse interface and be able to hold all of the common concrete 
        //methods/properties from the sub-classes. Almost exactly like lab1.
        IntroToProgrammingCourse introToProgrammingCourse = new IntroToProgrammingCourse("Introduction to Programming", "152-107",  2.0);
        IntroJavaCourse introJavaCourse = new IntroJavaCourse("Java Programming", "152-134", 4.0, "152-107 Introduction to Programming or 152-106 Basic Programming/Logic");
        AdvancedJavaCourse advancedJavaCourse = new AdvancedJavaCourse("Advanced Java Programming", "152-135", 4.0, "152-134 Java Programming");
        JOptionPane.showMessageDialog(null, "introToProgrammingCourse; Name: " + introToProgrammingCourse.getCourseName() + 
                " / Number: " + introToProgrammingCourse.getCourseNumber() + 
                " / Credits: " + introToProgrammingCourse.getCredits() +
                " / Prerequisites: " + introToProgrammingCourse.getPrerequisites() + ".");
        JOptionPane.showMessageDialog(null, "introJavaCourse; Name: " + introJavaCourse.getCourseName() + 
                " / Number: " + introJavaCourse.getCourseNumber() + 
                " / Credits: " + introJavaCourse.getCredits() +
                " / Prerequisites: " + introJavaCourse.getPrerequisites() + ".");
        JOptionPane.showMessageDialog(null, "advancedJavaCourse; Name: " + advancedJavaCourse.getCourseName() + 
                " / Number: " + advancedJavaCourse.getCourseNumber() + 
                " / Credits: " + advancedJavaCourse.getCredits() +
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
