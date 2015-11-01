package lesson.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class FrameEx2 extends JFrame{

    private JPanel panel;
    public FrameEx2(){
       setTitle("My app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 480);
        panel=new JPanel(){
            @Override
        public void paint(Graphics g){
                super.paint(g);
                g.drawRect(0, 0, 10, 50);
            }
        };

        //Опреелить свой класс панели унаследованной от JPanel
        //Определить класс Point
        //внутри класса своей панели хранить список List точек
        panel.setBackground(new Color(208, 195,203));
        add(panel);
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              //  e.getPoint();
            //JOptionPane.showMessageDialog(null, "cLICK"+e.getPoint());
               Graphics g= panel.getGraphics();
                g.fillOval(e.getX(),e.getY(), 30,10);
            }
        });

    }
    public static void main(String[] args) {
        FrameEx2 frameEx2=new FrameEx2();
        frameEx2.setVisible(true);


        //Добавление строки



    }
}

