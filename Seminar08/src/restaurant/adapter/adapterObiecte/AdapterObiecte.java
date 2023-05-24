package restaurant.adapter.adapterObiecte;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bucatarie.ISoftBucatarie;

public class AdapterObiecte implements ISoftBucatarie {
    private ISoftBar softBar;

    public AdapterObiecte(ISoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaNota(double totalPlata) {
        this.softBar.printeazaNotaBauturi(totalPlata);
    }
}
