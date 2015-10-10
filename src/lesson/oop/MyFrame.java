package lesson.oop;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {
    //AWT
    //SWING
    //javaFX

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Мое окно");
        frame.setVisible(true);
        frame.setSize(640, 480);

        JButton button=new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "My message");
            }
        });
        frame.add(button, BorderLayout.PAGE_START);





    }

}
