package ex01.entities;

import java.util.Scanner;

public class Dvd extends Midia {
    private int nFaixas;

    public Dvd() { }
    //public Dvd(Integer c, Double p, String s) { super(c, p, s); }

    public int getnFaixas() { return this.nFaixas; }
    public void setnFaixas(Integer f) { this.nFaixas = f; }

    public String getType() { return super.getType() + "Dvd"; }
    public String getDetails() { return super.getDetails() + "\n" + this.getType() + "\n Faixas: " + getnFaixas(); }

    public void insertData() {
        super.insertData();
        Scanner in = new Scanner(System.in);

        int dvd_nFaixas;

        System.out.print("~ Número de faixas: ");
        dvd_nFaixas = in.nextInt();

        setnFaixas(dvd_nFaixas);
    }


    


}