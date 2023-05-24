package restaurant.adapter.bar;

public class SoftBar implements ISoftBar{
    private String denumireBar;

    public SoftBar(String denumireBar) {
        this.denumireBar = denumireBar;
    }

    @Override
    public void printeazaNotaBauturi(double totalPlata) {
        System.out.println("Barul " + denumireBar + " a emis nota de plata cu total de " + totalPlata);
    }
}
