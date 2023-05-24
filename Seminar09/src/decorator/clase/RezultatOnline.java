package decorator.clase;

public class RezultatOnline extends DecoratorAbstract{

    public RezultatOnline(IFurnizareRezultat atr) {
        super(atr);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Online: " + diagnostic);
    }
}
