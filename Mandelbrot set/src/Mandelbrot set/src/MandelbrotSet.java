public class MandelbrotSet {
    public static void main(String[] args){
Generator g = new Generator(10);
g.generateSet();
    }
}
/*
Pseudo code:
Problems:
mandelbrot will currently be really small as i and j range from 0 to 1.
Solution thought of: we will introduce a size modifier. e.g if we make it 10. each coordinate will be 10 times further apart.
Therefore we will need to make each point 10 times bigger.
Note: if we make sure size modifier and step accuracy %10 =0 we won't need to deal with floating point sizes with our pixels :)
!!!MAIN CLASS!!!
application starts
Generator g;
g.generateSet

!!!GENERATOR CLASS!!!
Complex number C
create instance of drawset = ds
for j from -1 to 1, step accuracy
    for i from -1 to 1, step accuracy:
        if ((C(i,j)^2.modulus)+1)<1
        ds.drawPoint(i.modulus+width/2,j.modulus+height/2,width(accuracy),height(accuracy),colour) !modulus refers to the absolute value (distance) of the number.
                                                            !I'm hoping the complex number class will have this. Otherwise
                                                            we'llhave to use pythagorus
!!!DRAWSET CLASS!!!
GraphicWindow gw



drawpoint(Graphics g)














 */