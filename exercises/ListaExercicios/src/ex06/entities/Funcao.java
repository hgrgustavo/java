package ex06.entities;

public abstract class Funcao {
    private String nome;
    //
    
    public abstract double avaliarF(double a, double b, double x);

    public abstract void desenharF(double a, double b, double esp);
}
