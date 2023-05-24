package state.model;

public class Masa {
    private int numar;
    private IStare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public int getNumar() {
        return numar;
    }

    public IStare getStare() {
        return stare;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    public void setStare(IStare stare) {
        this.stare = stare;
    }



    public void ocupareMasa() {
        IStare stare = new StareOcupata();
        stare.modificaStare(this);
    }

    public void rezervaMasa() {
        IStare stare = new StareRezervata();
        stare.modificaStare(this);
    }

    public void elibereazaMasa() {
        IStare stare = new StareLibera();
        stare.modificaStare(this);
    }

    public void anuleazaRezervare() {
        this.elibereazaMasa();
    }
}
