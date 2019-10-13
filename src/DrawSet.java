import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawSet extends JPanel {
    private ArrayList<Point> Points;
    private ArrayList<Point> nPoints;


    GraphicWindow gw;
    public DrawSet(){
        this.Points=new ArrayList<>();
        this.nPoints=new ArrayList<>();

        gw = new GraphicWindow(1000,1000);
        gw.add(this);

    }

    public void addPoint(double x,double y){
        int ix=(int)x;
        int iy=(int)y;
        //int iwidth=(int)width*sizeModifier;
        //int iheight=(int)height*sizeModifier;
        Point p=new Point(ix,iy);
        Points.add(p);
    }
    public void addNonPoint(double x,double y){
        int ix=(int)x;
        int iy=(int)y;
        Point np=new Point(ix,iy);
        nPoints.add(np);

    }
    public void removeLastPoint(){
        Points.remove(Points.size());
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        for(Point p:Points){
            g.setColor(Color.BLACK);
            g.drawOval((int)p.getX(),(int)p.getY(),1,1);
        }
        for(Point np:nPoints){
            g.setColor(Color.BLUE);
            g.drawOval((int)np.getX(),(int)np.getY(),1,1);
        }




    }


}
