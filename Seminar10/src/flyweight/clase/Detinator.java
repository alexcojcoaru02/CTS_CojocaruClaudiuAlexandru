package flyweight.clase;

public class Detinator implements IClientBanca{
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Detinator(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void descriere(Cont cont) {
        System.out.println(this.toString() + cont.toString());
    }
}
