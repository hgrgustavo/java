package ex03.entities;

import java.util.Scanner;

public class Mp4 extends Arquivo
{
    private int nVisitas;

    public Mp4() {}
    public Mp4(int k, double p, String a, int d) {
        super(k, p, a);
        this.nVisitas = d;
    }

    @Override
    public String getTipo() { return super.getTipo() + " MP4"; }
    public String getDetalhes()
    {
        return String.format("""
                %s
                Visitas: %o""", super.getDetalhes(), this.nVisitas);
    }


    public void setnVisitas(int nVisitas) { this.nVisitas = nVisitas; }
    public void inserirDados()
    {
        Scanner in = new Scanner(System.in);

        super.inserirDados();

        int mp4_visitas;

        System.out.print("~ Total de visitas: ");
        mp4_visitas = in.nextInt();

        setnVisitas(mp4_visitas);
    }
}
