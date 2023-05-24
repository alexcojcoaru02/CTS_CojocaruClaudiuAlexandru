package state.model;

public class StareOcupata implements IStare{
    @Override
    public void modificaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareOcupata)) {
            System.out.println("Masa este ocupata acum");
            masa.setStare(this);
        } else {
            System.out.println("Masa nu poate fi ocupata");
        }
    }
}
