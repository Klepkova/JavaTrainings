package lesson.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by User on 13.12.2015.
 */
public class Scene extends JPanel {
    private Field field;
    Player player;
    Ball ball;

    public Scene(int width, int height){
        field = new Field(width, height, new Color(56, 152, 27));
        player = new Player(0, 0, 10, new Color(248, 250, 12));
        ball = new Ball(200, 100, 30, new Color(28, 250, 250));
    }
    private float distance(Point p1, Point p2){
        float xx= p1.getX()-p2.getX();
        float yy = p1.getY()-p2.getY();
        return (float)Math.sqrt(xx*xx+yy*yy);

    }



    @Override
    public void paint(Graphics g) {
        Point pp = player.getPosition();
        Point pb = ball.getPosition();
        float dist = distance(pp,pb);
        if(dist<player.getRadius()+ball.getRadius()){
            float dx=pp.getX()-pb.getX();
            float dy=pp.getY()-pb.getY();
            ball.move((int)(dx*0.1), (int)(dy*0.1));
        }

        g.setColor(field.color);
        g.fillRect(0, 0, field.getWidth(), field.getHeight());
        g.setColor(player.getColor());
        Point p = player.getPosition();
        g.fillOval(p.getX()-player.getRadius(),p.getY()-player.getRadius(), player.getRadius()*2, player.getRadius()*2);
        g.setColor(ball.getColor());
        Point b = ball.getPosition();
        g.fillOval(b.getX()-ball.getRadius(),b.getY()-ball.getRadius(), ball.getRadius()*2, ball.getRadius()*2);
    }

    public Player getPlayer() {
        return player;
    }
}
