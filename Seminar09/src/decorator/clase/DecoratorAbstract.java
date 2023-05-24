package decorator.clase;

public abstract class DecoratorAbstract implements IFurnizareRezultat{
    IFurnizareRezultat atr;

    public DecoratorAbstract(IFurnizareRezultat atr) {
        this.atr = atr;
    }

    @Override
    public void printeazaRezultat(String diagnostic) {
        atr.printeazaRezultat(diagnostic);
    }

    public abstract void afisareOnline(String diagnostic);
}
