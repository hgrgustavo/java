package ex06.app;

import ex06.entities.*;

public class Main {
    public static void main(String[] args) {
        FuncaoContinua fc = new FuncaoContinua();
        FuncaoDiscreta fd = new FuncaoDiscreta();

        fc.avaliarF(10.0, 20.0, 30.0);
        fc.desenharF(10.0, 10.0, 10.0);

        fd.avaliarF(15.0, 30.0, 45.0);
        fd.desenharF(15.0, 15.0, 15.0);

        
    }
}
