import java.awt.*;

public class Generator {
    double accuracy;
    double sizeModifier;
    Graphics g;
    Color black = Color.BLACK;
    public Generator(double accuracy) {
        this.accuracy=accuracy;
        this.sizeModifier=60;
        generateSet();
    }

    public void generateSet(){
        DrawSet ds = new DrawSet();
        for(double i=-sizeModifier;i<=sizeModifier;i+=accuracy){
            for(double j=-sizeModifier;j<=sizeModifier;j+=accuracy){
                ComplexNumber c= new ComplexNumber(i/sizeModifier,j/sizeModifier);
                if ((c.square().mod())+1<=2) {
                    ds.addPoint(c.getRe()+250, c.getIm()+250, accuracy, accuracy);
                }
            }
        }

    }
}
