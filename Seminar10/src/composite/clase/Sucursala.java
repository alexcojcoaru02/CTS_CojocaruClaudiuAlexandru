package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sucursala implements UnitateBancara {
    private String denumire;
    private int numarAngajati;
    private List<UnitateBancara> lista;

    public Sucursala(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitateBancara(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare + "Sucursala  " + this.denumire + " are " + this.numarAngajati + " angajati.");
        for (UnitateBancara unitateBancara : lista) {
            unitateBancara.descriere(indentare + "   ");
        }
    }
}
