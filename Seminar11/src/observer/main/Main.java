package observer.main;

import observer.model.Client;
import observer.model.IClient;
import observer.model.Restaurant;

public class Main {
//    12. Restaurantul dorește să anunțe clienții fideli ori de câte ori apar noi oferte. Astfel se dorește
//    implementarea unui modul care atunci când se realizează o ofertă de preț sau se introduce un nou
//    meniu să se trimită notificări tuturor clienților abonați la notificările restaurantului
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Alfredo");
        IClient client1 = new Client("Alexandru");
        IClient client2 = new Client("Cristina");
        restaurant.abonareClient(client1);
        restaurant.abonareClient(client2);
        restaurant.abonareClient(new Client("Anonim"));

        restaurant.introduceOfertaNoua();
    }
}
