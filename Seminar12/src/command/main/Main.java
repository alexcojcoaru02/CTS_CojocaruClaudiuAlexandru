package command.main;

import command.model.Autobuz;
import command.model.CommandPlecareCursa;
import command.model.IAutomobil;
import command.model.ManagerComenzi;

public class Main {

    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        IAutomobil autobuz = new Autobuz(13);

        managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(1)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(11, (Autobuz) autobuz));
        managerComenzi.invocaComanda(new CommandPlecareCursa(12, new Autobuz(3)));
        managerComenzi.invocaComanda(new CommandPlecareCursa(11, (Autobuz) autobuz));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new CommandPlecareCursa(10, new Autobuz(23)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}
