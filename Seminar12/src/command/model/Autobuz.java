package command.model;

public class Autobuz implements IAutomobil{
    private int nr;

    public Autobuz(int nr) {
        this.nr = nr;
    }

    @Override
    public void plecareInCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul " + this.nr + " a plecat in cursa pe linia " + nrLinie);
    }
}
