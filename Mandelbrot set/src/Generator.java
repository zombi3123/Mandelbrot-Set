import java.awt.*;

public class Generator {
    double accuracy;
    double sizeModifier;
    Graphics g;
    Color black = Color.BLACK;
    public Generator(double accuracy) {
        this.accuracy=accuracy;
        this.sizeModifier=5;
        generateSet();
    }

    public void generateSet(){
        DrawSet ds = new DrawSet();
        for(double i=-1;i<=1;i+=accuracy){
            for(double j=-1;j<=1;j+=accuracy){
                ComplexNumber c= new ComplexNumber(i,j);
                if ((c.square().mod())+1<2) {
                    ds.addPoint((i + 250 / 2)*sizeModifier, (j + 250 / 2)*sizeModifier, accuracy, accuracy);
                }
            }
        }

    }
}
