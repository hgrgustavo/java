public class Usuario {
    public static void main (String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.print("TV Ligada?" + smartTv.ligada);
        System.out.print("Canal Atual: " + smartTv.canal);
        System.out.print("Volume atual: " + smartTv.volume);
    }
}
