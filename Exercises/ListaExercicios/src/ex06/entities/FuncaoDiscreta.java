package ex06.entities;

import edu.princeton.cs.introcs.StdDraw;

public class FuncaoDiscreta extends Funcao {

    private double a, b, esp, x;

    @Override
    public double avaliarF(double a, double b,  double x) { return this.a * x + this.b; }

    @Override
    public void desenharF(double a, double b, double esp) {
        double ya, yb, y, maior, menor;

        StdDraw.clear();
        StdDraw.setXscale(a, b);

        ya = avaliarF(a, b, esp);

        maior = ya;
        menor = ya;

        yb = avaliarF(a, b, esp);


        StdDraw.setYscale(ya, yb);


        for(double x = a; x <= b; x += esp) {
            y = avaliarF(a, b, esp);

            if(maior < y) {
                maior = y;
            }

            if(menor > y) {
                menor = y;
            }
        }

        StdDraw.setXscale(a, b);
        StdDraw.setYscale(1, maior);
        StdDraw.setPenRadius(2.0);



        for (double x = a; x <= b; x += esp) {
            y = avaliarF(a, b, esp);

            StdDraw.line(x, 1, x, y);
        }
    }
}
