package strategy.main;

import strategy.model.Calator;
import strategy.model.PlataCardBancar;
import strategy.model.PlataCardCalatorii;
import strategy.model.PlataSms;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Kraken");
        calator.platesteBilet(40);
        calator.setMetodaPlata(new PlataSms());
        calator.platesteBilet(25);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(14);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(33);
    }
}