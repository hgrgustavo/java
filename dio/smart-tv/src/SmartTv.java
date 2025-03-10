/*
    1. Características:
        Ligada (boolean)
        Canal (int)
        volume (int)

    2. TV poderá ligar e desligar e assim mudar o estado ligada
    3. TV aumentará o volume em  +1 ou -1
    4. TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
*/

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }
}
