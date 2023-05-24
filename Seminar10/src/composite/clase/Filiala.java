package composite.clase;

public class Filiala implements UnitateBancara {
    private String denumire;
    private int numarAngajati;

    public Filiala(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();

    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();

    }

    @Override
    public UnitateBancara getUnitateBancara(int index) {
        throw new RuntimeException();
    }

    @Override
    public void descriere(String indentare) {
        System.out.println(indentare + "Filiala " + this.denumire + " are " + this.numarAngajati + " angajati.");
    }
}
