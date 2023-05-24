package state.model;

public class StareRezervata implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if (masa.getStare() instanceof StareLibera) {
            System.out.println("Masa este rezervata acum");
            masa.setStare(this);
        } else {
            System.out.println("Masa este nu poate fi rezervata");
        }
    }
}
