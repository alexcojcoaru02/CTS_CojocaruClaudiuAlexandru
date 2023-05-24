package strategy.model;

public class VerificarePersoanaFizica implements ModVerificare {
    @Override
    public void verifica() {
        System.out.println("Verifica persoana fizica la registrul comertului.");
    }
}
