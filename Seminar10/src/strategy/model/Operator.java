package strategy.model;

public class Operator {
    private ModVerificare modVerificare;

    public Operator() {
        this.modVerificare = new VerificarePersoanaFizica();
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificaClient() {
        modVerificare.verifica();
    }
}
