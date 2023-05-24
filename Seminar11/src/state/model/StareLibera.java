package state.model;

public class StareLibera implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareLibera)) {
            System.out.println("Masa este eliberata acum");
            masa.setStare(this);
        } else {
            System.out.println("Masa este deja libera");
        }
    }
}
