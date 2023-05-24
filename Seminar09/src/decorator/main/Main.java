package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.IFurnizareRezultat;
import decorator.clase.RezultatOnline;
import decorator.clase.RezultatPeHartie;

public class Main {
//    7. Spitalul dorește să testeze punerea la dispoziție a rezultatelor prin intermediul platformei online
//    ci nu doar printat. Există însă riscul să se revină la forma inițială de punere la dispoziția pacienților
//    a rezultatelor. Se dorește adăugarea acestei noi funcționalități pentru sistemul software, care să
//    permită revenirea la situația inițială.
    public static void main(String[] args) {
        IFurnizareRezultat rezultatPeHartie = new RezultatPeHartie();
        rezultatPeHartie.printeazaRezultat("raceala grava");

        DecoratorAbstract ambeleTipuriDeRezultate = new RezultatOnline(rezultatPeHartie);
        ambeleTipuriDeRezultate.afisareOnline("gripa");
        ambeleTipuriDeRezultate.printeazaRezultat("entorsa");
    }
}