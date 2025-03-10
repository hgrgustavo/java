package app;

import dispositivos.ComboDevice;
import dispositivos.ConcretePrinter;
import dispositivos.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1008");
        p.processarDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processarDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice c = new ComboDevice("2001");
        c.processarDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
    }
}
