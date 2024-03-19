import javax.swing.*;
import java.awt.event.*;

public class CurrencyConverter {

    // Function to convert from rupee to the dollar and vice-versa using Java Swing
    public static void converter() {

        // Creating a new frame using JFrame
        JFrame f = new JFrame("CONVERTER");

        // Creating two labels
        JLabel l1, l2;

        // Creating two text fields. One for rupee and one for the dollar
        JTextField t1, t2;

        // Creating three buttons
        JButton b1, b2, b3;

        // Naming the labels and setting the bounds for the labels
        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 60, 30);
        l2 = new JLabel("Dollars:");
        l2.setBounds(170, 40, 60, 30);

        // Initializing the text fields with 0 by default and setting the bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(80, 40, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(240, 40, 50, 30);

        // Creating a button for INR, one button for the dollar, and one button to close and setting the bounds
        b1 = new JButton("INR");
        b1.setBounds(50, 80, 60, 15);
        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 60, 15);
        b3 = new JButton("Close");
        b3.setBounds(150, 150, 60, 30);

        // Adding action listener for converting rupees to dollars
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Convert the text in t1 (rupees) to double
                    double rupees = Double.parseDouble(t1.getText());
                    // Convert rupees to dollars using the appropriate conversion rate
                    double dollars = rupees / 65.25; // Assuming the conversion rate
                    // Set the calculated value in t2 (dollars) text field
                    t2.setText(String.valueOf(dollars));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        });

        // Adding action listener for converting dollars to rupees
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Convert the text in t2 (dollars) to double
                    double dollars = Double.parseDouble(t2.getText());
                    // Convert dollars to rupees using the appropriate conversion rate
                    double rupees = dollars * 65.25; // Assuming the conversion rate
                    // Set the calculated value in t1 (rupees) text field
                    t1.setText(String.valueOf(rupees));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        });

        // Action listener to close the form
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });

        // Default method for closing the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding the created objects to the form
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Driver code
    public static void main(String args[]) {
        converter();
    }
}
