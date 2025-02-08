package intro.observerPattern;

import javax.swing.*;

public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swingy");
        frame.setVisible(true);

        JButton button = new JButton("Click me!");
        button.addActionListener(e -> System.out.println("Don't do it"));
        button.addActionListener(e -> System.out.println("Now do it"));
        frame.add(button);
    }
}
