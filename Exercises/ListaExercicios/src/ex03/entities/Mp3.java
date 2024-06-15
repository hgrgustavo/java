package ex03.entities;

import java.util.Scanner;

public class Mp3 extends Arquivo
{
    private int nDownloads;

    //public Mp3() {}
    public Mp3(int k, double p, String a, int d) {
        super(k, p, a);
        this.nDownloads = d;
    }

    @Override
    public String getTipo() { return super.getTipo() + " MP3"; }
    public String getDetalhes()
    {
        return String.format("""
                %s
                Downloads: %o""", super.getDetalhes(), this.nDownloads);
    }


    public void setnDownloads(int nDownloads) { this.nDownloads = nDownloads; }
    public void inserirDados()
    {
        Scanner in = new Scanner(System.in);

        super.inserirDados();
        
        int mp3_downloads;

        System.out.print("~ Total de downloads: ");
        mp3_downloads = in.nextInt();
        
        setnDownloads(mp3_downloads);
    }
}
