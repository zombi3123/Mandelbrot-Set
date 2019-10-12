import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GraphicWindow extends JFrame { //!!Need to add the thing I'm drawing TO this JFrame.. This is why paint component isn't being called
    public GraphicWindow(int width,int height){

        setSize(width,height);
        setTitle("Mandelbrot set!");
        setResizable(false);
        setBackground(Color.PINK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
