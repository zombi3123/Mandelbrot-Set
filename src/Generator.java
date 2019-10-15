import java.awt.*;

public class Generator {
    double jump;
    double sizeModifier;
    int iterationRate,range;
    ComplexNumber c;
    public Generator(double jump) {
        this.jump=jump;
        this.sizeModifier=40;
        this.iterationRate=10;
        this.range=100;
        c=new ComplexNumber();
    }

    public void generateSet(){
        DrawSet ds = new DrawSet();
        int ticker=0;
        for(double i=-range;i<=range;i+=jump){
            for(double j=-range;j<=range;j+=jump){
                c= new ComplexNumber((i/range),(j/range));
                double nc=c.square().mod()+1;
                    if (nc < 2) {
                        for(int k=0;k<=iterationRate;k++) {
                            //System.out.println("nc:"+nc);
                        ticker++;
                            //System.out.println("ticker:"+ticker);
                        if(ticker==iterationRate) {
                            ds.addPoint(i + 450, j + 450);

                        }
                      /*  if(nc>=2){
                            ds.addNonPoint(i+450,j+450);
                            break;
                            }*/
                      else {
                            nc = Math.pow(nc, 2) + 1;
                        }
                    }
                }
                ticker=0;
                }
            }
        }

    }

