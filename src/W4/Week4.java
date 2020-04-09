package W4;

import javax.swing.*;
import java.awt.*;

public class Week4 extends JFrame {
    private static JFrame frame = new JFrame("Week 4 - Yael Brown");
    private static JPanel panel;

    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;
    private static int val;

    public Week4() {
        setFrame(WIDTH, HEIGHT);
        val = 0;

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300,300));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setTitle("This is title");
        frame.pack();
        frame.setVisible(true);

        frame.setLocationRelativeTo(null);
    }

    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void add(int v) {
        val = val + v;
    }

    public static void sub(int v) {
        val = val - v;
    }

    public static void mul(int v) {
        val = val * v;
    }

    public static void div(int v) {
        if (v == 0) { v = 1; }
        val = val / v;
    }

    public static void main(String[] args) {
        System.out.println("this is cool");

        Week4 w4 = new Week4();
    }

}
