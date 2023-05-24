package restaurant.adapter.adpterClase;

import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.ISoftBucatarie;

public class AdapterRestaurant extends SoftBar implements ISoftBucatarie {
    public AdapterRestaurant(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaNota(double totalPlata) {
        super.printeazaNotaBauturi(totalPlata);
    }
}
