package decorator.clase;

public class RezultatPeHartie implements IFurnizareRezultat {
    @Override
    public void printeazaRezultat(String diagnostic) {
        System.out.println("Hartie: " + diagnostic);
    }
}
