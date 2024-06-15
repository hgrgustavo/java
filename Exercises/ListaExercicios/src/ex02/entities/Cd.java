package ex02.entities;

import java.util.Scanner;

public class Cd extends Midia {
    private int nMusic;

    //public Cd() { }
    public Cd(Integer c, Double p, String s, Integer q) {
        super(c, p, s);
        setnMusic(q);
    }

    public int getnMusic() { return this.nMusic; }
    public void setnMusic(Integer m) { this.nMusic = m; }

    public String getType() { return super.getType() + "Cd"; }
    public String getDetails() { return super.getDetails() + "\n" + getType() + "\n Músicas: " + getnMusic(); }

    public void insertData() {
        super.insertData();

        Scanner in = new Scanner(System.in);
        int cd_nMusica;

        System.out.print("~ Número de músicas: ");
        cd_nMusica = in.nextInt();

        setnMusic(cd_nMusica);
    }

}
