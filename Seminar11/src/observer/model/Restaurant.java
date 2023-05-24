package observer.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant {
    private String nume;
    private List<IClient> listaClienti;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaClienti = new ArrayList<>();
    }

    @Override
    public void abonareClient(IClient client) {
        this.listaClienti.add(client);
    }

    @Override
    public void dezabonareCLient(IClient client) {
        this.listaClienti.remove(client);
    }

    @Override
    public void notificareClienti(String mesaj) {
        for (IClient client : listaClienti) {
            client.primesteNotificare(mesaj);
        }
    }

    public void introduceOfertaNoua() {
        notificareClienti(this.nume + " a introdus o oferta noua");
    }

    public void adaugaDiscount(int discount) {
        notificareClienti(this.nume + " a introdus un discount de " + discount + "%");
    }
}
