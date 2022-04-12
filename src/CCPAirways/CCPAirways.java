// CCPAirways.java
// program for checking an airline club member's rank utilizing even-driven GUI, AWT, Swing for CSCI 112
// last edited Feb. 14, 2022 by S. Gutierrez

package CCPAirways;

// imports GUI and event handling
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// program checks an airline club member's rank
public class CCPAirways {

    // main initializes JFrame and sets it up
    public static void main(String[] args) {

        // initializes JFrame
        AirwaysFrame myFrame = new AirwaysFrame();

        // sets up JFrame
        myFrame.setTitle("CCP Airways Frequent Flyer Program");
        myFrame.setSize(400, 256);
        myFrame.setLocation(200, 100);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    } // ends main() method

} // ends CCPAirways class

// adds and configures components, in addition to being the ActionListener
class AirwaysFrame extends JFrame implements ActionListener {

    // instantiates new components
    JLabel jlblHeading = new JLabel("Enter your miles to see your membership eligibility:");
    JTextField jtfMiles = new JTextField(10);
    JLabel jlblStatus = new JLabel();

    // constructor uses FlowLayout for component arrangement
    public AirwaysFrame() {

        // sets components to center alignment
        setLayout(new FlowLayout(FlowLayout.CENTER));

        // adds components to layout
        add(jlblHeading);
        add(jtfMiles);
        add(jlblStatus);

        // adds the text box to action listener for expected user input
        jtfMiles.addActionListener(this);

    } // end AirwaysFrame() constructor

    // responds to an event based off the users input
    public void actionPerformed(ActionEvent e) {

        // gets the user input from the text box, parses, and stores it
        int miles = Integer.parseInt(jtfMiles.getText());

        // resets the text box to blank
        jtfMiles.setText("");

        // checks the input to determine rank eligibility if in certain number ranges
        if ((miles > 0) && (miles < 10000)) {

            System.out.println("CCP Flyer");
            jlblStatus.setText("CCP Flyer");

        } else if ((miles >= 10000) && (miles <= 24999)) {

            System.out.println("CCP Silver Flyer");
            jlblStatus.setText("CCP Silver Flyer");

        } else if ((miles >= 25000) && (miles <= 49999)) {

            System.out.println("CCP Silver Flyer");
            jlblStatus.setText("CCP Silver Flyer");

        } else if (miles >= 50000) {

            System.out.println("CCP Silver Flyer");
            jlblStatus.setText("CCP Silver Flyer");

        } else {

            System.out.println("Sorry, you are not eligible for the Frequent Flyer Program.");
            jlblStatus.setText("Sorry, you are not eligible for the Frequent Flyer Program.");

        } // ends else statement

    } // ends actionPerformed() method

} // ends AirwaysFrame class