package observer.model;

public interface IRestaurant {
    void abonareClient(IClient client);
    void dezabonareCLient(IClient client);
    void notificareClienti(String mesaj);
}
