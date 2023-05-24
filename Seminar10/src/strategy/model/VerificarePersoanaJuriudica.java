package strategy.model;

public class VerificarePersoanaJuriudica implements ModVerificare {
    @Override
    public void verifica() {
        System.out.println("Verifica persoana juridica la registrul comertului.");
    }
}
