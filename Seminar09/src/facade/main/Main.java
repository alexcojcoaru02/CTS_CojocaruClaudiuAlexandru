package facade.main;

import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.interneazaPacient("Andrei Cotoi");
        facade.interneazaPacient("Cotoi");
    }
}
