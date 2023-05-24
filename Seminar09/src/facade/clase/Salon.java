package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaturiLibere;

    public Salon() {
        coduriPaturiLibere = new ArrayList<>();
    }

    public void adaugaPatLiber(int codPat) {
        this.coduriPaturiLibere.add(codPat);
    }

    public boolean verificaPaturiLibere() {
        return this.coduriPaturiLibere.size() > 0; // sau cu .isEmplty
    }

    public void ocupaPat() {
        this.coduriPaturiLibere.remove(0);
    }
}
