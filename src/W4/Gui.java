

//Event listen for the button
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// API classes
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {
    static JFrame frame = new JFrame("Week4 GUI");

    public static void main(String args[]) {
        JPanel ageCalculatorPanel = new JPanel();
        ageCalculatorPanel.setLayout(null);
        final JLabel titleLabel = new JLabel("Age Calculator");
        titleLabel.setBounds(150, 15, 200, 30);
        //Change the front size of the title
        titleLabel.setFont (titleLabel.getFont ().deriveFont (25.0f));
        JLabel currentYearLabel = new JLabel("Enter the current year: ");
        currentYearLabel.setBounds(200, 50, 300, 30);

        final JTextField currentYear = new JTextField(10);
        currentYear.setBounds(400, 50, 100, 30);

        JLabel dOBLabel = new JLabel("Enter the birth year: ");
        dOBLabel.setBounds(200, 100, 250, 30);

        final JTextField yearOfBirth = new JTextField(10);
        yearOfBirth.setBounds(400, 100, 100, 30);

        //Setting up the button
        JButton btn = new JButton();
        btn.setText("Calculate");
        btn.setBounds(200, 150, 250, 20);

        //RGB for the button
        Color btnColor = new Color(204, 235, 255);
        btn.setBackground(btnColor);

        //The output for the age
        JLabel sum = new JLabel("You are: ");
        sum.setBounds(200, 200, 300, 30);

        //Temporary Disable the result field.
        final JTextField calculateAge = new JTextField(10);
        calculateAge.setBounds(300, 200, 100, 30);
        calculateAge.setEditable(!true);

        //Even listener when the button got clicked
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent aE) {
                String x = currentYear.getText();
                String y = yearOfBirth.getText();
                //Default integers if the user doesn't type anything
                int cYear = 0;
                int yOfBirth = 0;
                //Control flow
                if (x.trim().length() != 0) {
                    cYear = Integer.parseInt(x);
                }//End if
                if (y.trim().length() != 0) {
                    yOfBirth = Integer.parseInt(y);
                }//End if
                //Control flow if the user press on calculate without data
                if(cYear == yOfBirth) {
                    System.out.println();
                    System.err.println("Field cannot be blank, Please try again!");
                    System.exit(0);// Exit the program if the user enters nothing
                }//End if

                calculateAge.setText(( cYear - yOfBirth) + " years old");

            }
        });
        //Panels that display contents in the frame
        ageCalculatorPanel.add(currentYearLabel);
        ageCalculatorPanel.add(dOBLabel);
        ageCalculatorPanel.add(titleLabel);
        ageCalculatorPanel.add(currentYear);
        ageCalculatorPanel.add(yearOfBirth);
        ageCalculatorPanel.add(btn);
        ageCalculatorPanel.add(calculateAge);
        ageCalculatorPanel.add(sum);
        frame.add(ageCalculatorPanel);

        //Width and Height of the frame
        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Make the frame visible
        frame.setVisible(!false);

    }//End main


}//End Gui class