package facade.clase;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacienti;

    public Medic() {
        this.pacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient) {
        pacienti.add(pacient);
    }

    public Boolean verificaTrimitere(Pacient pacient) {
        return this.pacienti.contains(pacient);
    }



    public Pacient getPacient(String numePacient) {
        for (Pacient pacient : pacienti) {
            if (pacient.getNume().equals(numePacient)) {
                return pacient;
            }
        }
        return null;
    }
}
