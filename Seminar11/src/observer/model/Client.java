package observer.model;

public class Client implements IClient {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + nume + " a primit notificarea: " + mesaj);
    }
}
