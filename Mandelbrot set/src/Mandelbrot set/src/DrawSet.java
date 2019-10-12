import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawSet extends JPanel {
    ArrayList<Point> Points;

    GraphicWindow gw;
    public DrawSet(){
        this.Points=new ArrayList<>();
        gw = new GraphicWindow(1000,1000);
        gw.add(this);
    }

    public void addPoint(double x,double y,double width,double height){
        int ix=(int)x;
        int iy=(int)y;
        //int iwidth=(int)width*sizeModifier;
        //int iheight=(int)height*sizeModifier;
        Point p=new Point(ix,iy);
        addArrayOfPoints(p);
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
