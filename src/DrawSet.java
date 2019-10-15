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
        Point a=new Point(ix,iy);
        Points.add(a);
        //System.out.println(Points.size());
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
        int pointSize=1;
        super.paintComponents(g);
        System.out.println(Points.size());
        for(int i=0;i<Points.size();i++){
            g.setColor(Color.BLACK);
            g.drawOval((int)Points.get(i).getX(),(int)Points.get(i).getY(),pointSize,pointSize);
        }

        for(Point np:nPoints){
            g.setColor(Color.BLUE);
            g.drawOval((int)np.getX(),(int)np.getY(),pointSize,pointSize);
        }




    }


}
