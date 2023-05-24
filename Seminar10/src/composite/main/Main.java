package composite.main;

import composite.clase.Filiala;
import composite.clase.Sucursala;
import composite.clase.UnitateBancara;

public class Main {
//    9. Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
//    mai multe agenții, iar o agenție deține mai multe filiale.
    public static void main(String[] args) {
        UnitateBancara sucursala1 = new Sucursala("Sucursala1", 19);

        UnitateBancara agentie1 = new Sucursala("Agentie1", 23);
        UnitateBancara agentie2 = new Sucursala("Agentie2", 34);

        UnitateBancara filiala1 = new Filiala("Filiala1", 23);
        UnitateBancara filiala3 = new Filiala("Filiala3", 23);
        UnitateBancara filiala2 = new Filiala("Filiala2", 23);

        sucursala1.adaugaUnitate(agentie1);
        sucursala1.adaugaUnitate(agentie2);

        agentie1.adaugaUnitate(filiala1);
        agentie2.adaugaUnitate(filiala2);
        agentie1.adaugaUnitate(filiala3);

        sucursala1.descriere("");
    }
}