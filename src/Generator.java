import java.awt.*;

public class Generator {
    double jump;
    double sizeModifier;
    int iterationRate,range;
    ComplexNumber c;
    Graphics g;
    Color black = Color.BLACK;
    public Generator(double jump) {
        this.jump=jump;
        this.sizeModifier=40;
        this.iterationRate=10;
        this.range=100;
        c=new ComplexNumber();
    }

    public void generateSet(){
        DrawSet ds = new DrawSet();
        for(double i=-range;i<=range;i+=jump){
            for(double j=-range;j<=range;j+=jump){
                c= new ComplexNumber((i/range),(j/range));
                if ((c.square().mod())+1<=2) {
                        ds.addPoint(i+500, j+500);
                }
                }
            }
        }

    }

