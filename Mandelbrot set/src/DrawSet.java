import javax.swing.*;
import java.awt.*;

public class DrawSet extends JPanel {
    GraphicWindow gw;
    public DrawSet(){
        gw = new GraphicWindow(1000,1000);
    }

    public void addPoint(double x,double y,double width,double height){
        int ix=(int)x;
        int iy=(int)y;
//int iwidth=(int)width*sizeModifier;
//int iheight=(int)height*sizeModifier;
Point p=new Point(ix,iy);
gw.addArrayOfPoints(p);
    }


}
