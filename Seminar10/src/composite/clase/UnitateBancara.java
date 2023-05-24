package composite.clase;

public interface UnitateBancara {
    void adaugaUnitate(UnitateBancara unitateBancara);
    void stergeUnitate(UnitateBancara unitateBancara);
    UnitateBancara getUnitateBancara(int index);
    void descriere(String indentare);
}
