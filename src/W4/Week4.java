package W4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Week4 extends JFrame {
    private static JFrame frame = new JFrame("Week 4 - Yael Brown");

    private static final int WIDTH = 400;
    private static final int HEIGHT = 500;
    private static int valtoCompute;

    private static int valA = 0;
    private static int valS = 0;
    private static int valM = 0;
    private static float valD = 0.0f;

    private static JLabel addVal = new JLabel(String.valueOf(valA));
    private static JLabel subVal = new JLabel(String.valueOf(valS));
    private static JLabel mulVal = new JLabel(String.valueOf(valM));
    private static JLabel divVal = new JLabel(String.valueOf(valD));

    public Week4() {
        JPanel row1 = new JPanel();
        JLabel addLabel = new JLabel("Add:");
        row1.setSize(200, 75);
        row1.add(addLabel);
        row1.add(addVal);

        JPanel row2 = new JPanel();
        JLabel subLabel = new JLabel("Subtract:");
        row2.setSize(200, 75);
        row2.add(subLabel);
        row2.add(subVal);

        JPanel row3 = new JPanel();
        JLabel mulLabel = new JLabel("Multiply:");
        row3.setSize(200, 75);
        row3.add(mulLabel);
        row3.add(mulVal);

        JPanel row4 = new JPanel();
        JLabel divLabel = new JLabel("Divide:");
        row4.setSize(200, 75);
        row4.add(divLabel);
        row4.add(divVal);

        JPanel row5 = new JPanel();
        JLabel inputLabel = new JLabel("Provide number to compute:");
        JTextField inputText = new JTextField(4);
        JButton inputCalc = new JButton("Calculate");
        ActionListener calcAL = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    valtoCompute = Integer.parseInt(inputText.getText());
                } catch (Exception e) {
                    valtoCompute = 5;
                    System.out.println("Unable to parse input, converting to 5");
                    System.out.println(e);
                    System.out.println("valtoCompute = " + valtoCompute);
                } finally {
                    compute(valtoCompute);
                }
            }
        };
        inputCalc.addActionListener(calcAL);
        row5.setSize(200, 75);
        row5.add(inputLabel);
        row5.add(inputText);
        row5.add(inputCalc);

        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("Quick Calculate");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(5,1));

        frame.add(row1);
        frame.add(row2);
        frame.add(row3);
        frame.add(row4);
        frame.add(row5);
    }

    public static void add(int v) {
        valA += v;
        addVal.setText(String.valueOf(valA));
    }

    public static void sub(int v) {
        valS -= v;
        subVal.setText(String.valueOf(valS));
    }

    public static void mul(int v) {
        if (valM == 0) { valM = 1; }
        valM *= v;
        mulVal.setText(String.valueOf(valM));
    }

    public static void div(int v) {
        if (v == 0) { v = 1; }
        if (valD == 0) { valD = 1; }
        valD /= v;
        divVal.setText(String.valueOf(valD));
    }

    public static void compute(int v) {
        report(v, true);
        add(v);
        sub(v);
        mul(v);
        div(v);
        report(v, false);
    }

    public static void report(int v, boolean isBeforeCalc) {
        if (isBeforeCalc) {
            System.out.println("Before calculations =====");
            System.out.println("Number to use for calculations: " + v);
        } else {
            System.out.println("After calculations =====");
        }
        System.out.println("valA = " + valA);
        System.out.println("valS = " + valS);
        System.out.println("valM = " + valM);
        System.out.println("valD = " + valD);
    }

    public static void main(String[] args) {
        Week4 w4 = new Week4();
    }

}
