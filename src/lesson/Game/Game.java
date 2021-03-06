package lesson.Game;

import javax.swing.*;
import java.awt.event.*;

public class Game extends JFrame {
    public Game() {
        setSize(640, 480);
        setTitle("Soccer");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final Scene scene = new Scene(getWidth(), getHeight());
        add(scene);
        final boolean[] keys = new boolean [4];
        Timer timer = new Timer(30, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int step=3;
                int x = 0;
                int y = 0;

                if(keys[0]) y-=step;
                if(keys[1]) x+=step;
                if(keys[2]) y+=step;
                if(keys[3]) x-=step;
                scene.getPlayer().move(x, y);
                scene.repaint();
            }
        });

        timer.start();

        addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                        keys[1]=false;
                        //x = step;
                        break;
                    case KeyEvent.VK_LEFT:
                        keys[3]=false;
                        // x = -step;
                        break;
                    case KeyEvent.VK_UP:
                        keys[0]=false;
                        // y = -step;
                        break;
                    case KeyEvent.VK_DOWN:
                        keys[2]=false;
                        //y = step;
                        break;
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_RIGHT:
                        keys[1]=true;
                        //x = step;
                        break;
                    case KeyEvent.VK_LEFT:
                        keys[3]=true;
                       // x = -step;
                        break;
                    case KeyEvent.VK_UP:
                        keys[0]=true;
                       // y = -step;
                        break;
                    case KeyEvent.VK_DOWN:
                        keys[2]=true;
                        //y = step;
                        break;
                    case KeyEvent.VK_SPACE:

                        break;
                }


            }
        });

    }

    public void start() {
        setVisible(true);
    }
}
