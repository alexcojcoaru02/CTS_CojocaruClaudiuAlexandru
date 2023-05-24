package restaurant.proxy.clase;

public class Restaurant implements IRestaurant {
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        System.out.println("Au fost rezervate " + numarPersoane + " locuri la restaurantul " + nume);
    }
}
