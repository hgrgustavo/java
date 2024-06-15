package ex06.entities;

import edu.princeton.cs.introcs.StdDraw;

public class FuncaoContinua extends Funcao  {
    private double a, b, esp, x;


    @Override
    public double avaliarF(double a, double b, double x) { return this.a * x + this.b; }

    @Override
    public void desenharF(double a, double b, double esp) {
        double ya, yb, y = 0;

        StdDraw.clear();
        StdDraw.setXscale(a, b);

        ya = avaliarF(a, b, esp);
        yb = avaliarF(a, b, esp);

        StdDraw.setYscale(ya, yb);


        for(double x = a; x <= b; x += esp) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x, y, 0.08);
            StdDraw.setPenRadius(2.0);
            StdDraw.show(2);
        }
    }




}
