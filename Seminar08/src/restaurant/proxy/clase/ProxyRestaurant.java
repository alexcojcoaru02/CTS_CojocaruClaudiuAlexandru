package restaurant.proxy.clase;

public class ProxyRestaurant implements IRestaurant {
    IRestaurant restaurant;

    public ProxyRestaurant(IRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        if (numarPersoane >= 4)
            restaurant.rezervaMasa(numarPersoane);
        else
            System.out.println("Rezervarea nu a putut fi efectuata!");
    }
}
