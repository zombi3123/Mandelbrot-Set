import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicWindow extends JFrame { //!!Need to add the thing I'm drawing TO this JFrame.. This is why paint component isn't being called
    ArrayList<Point> Points;
    public GraphicWindow(int width,int height){
       this.Points=new ArrayList<>();
        setSize(width,height);
        setTitle("Mandelbrot set!");
        setResizable(false);
        setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void addArrayOfPoints(Point xy){
        Points.add(xy);
    }
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        for(Point p:Points){
            g.setColor(Color.BLACK);
            g.drawOval((int)p.getX(),(int)p.getY(),2,2);
        }




    }
}
