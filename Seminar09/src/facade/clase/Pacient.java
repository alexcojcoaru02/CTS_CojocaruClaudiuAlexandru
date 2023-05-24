package facade.clase;

public class Pacient {
    private String nume;
    private int gravitate;

    public Pacient(String nume, int gravitate) {
        this.nume = nume;
        this.gravitate = gravitate;
    }

    public int getGravitate() {
        return gravitate;
    }

    public String getNume() {
        return nume;
    }
}
