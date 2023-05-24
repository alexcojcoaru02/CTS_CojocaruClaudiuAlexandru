package restaurant.adapter.bucatarie;

public class Bucatarie implements ISoftBucatarie {
    private String bucatarSef;

    public Bucatarie(String bucatarSef) {
        this.bucatarSef = bucatarSef;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        System.out.println("Nota de la sef " + bucatarSef + " a fost in total de: " + totalPlata);
    }
}
