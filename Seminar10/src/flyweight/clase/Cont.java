package flyweight.clase;

public class Cont {
    private float suma;
    private int numarCont;

    public Cont(float suma, int numarCont) {
        this.suma = suma;
        this.numarCont = numarCont;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("suma=").append(suma);
        sb.append(", numarCont=").append(numarCont);
        sb.append('}');
        return sb.toString();
    }
}
