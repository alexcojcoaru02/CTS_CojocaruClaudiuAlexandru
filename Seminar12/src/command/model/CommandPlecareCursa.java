package command.model;

public class CommandPlecareCursa implements ICommand{
    private int nrLinie;
    private Autobuz automobil;

    public CommandPlecareCursa(int nrLinie, Autobuz automobil) {
        this.nrLinie = nrLinie;
        this.automobil = automobil;
    }

    @Override
    public void execute() {
        automobil.plecareInCursa(this.nrLinie);
    }
}
