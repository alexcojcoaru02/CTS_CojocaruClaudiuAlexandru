package restaurant.adapter.main;

import restaurant.adapter.adapterObiecte.AdapterObiecte;
import restaurant.adapter.adpterClase.AdapterRestaurant;
import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftBucatarie;

public class Main {

    public static void printeaza(ISoftBucatarie bucatarie, double total){
        bucatarie.printeazaNota(total);
    }

    public static void main(String[] args) {
        ISoftBucatarie bucatarie = new Bucatarie("Muhamad Ali");

        AdapterRestaurant restaurant = new AdapterRestaurant("Alfredo");
        printeaza(bucatarie, 300);
        Main.printeaza(restaurant, 150);

        ISoftBar softBar = new SoftBar("Bar1");
        AdapterObiecte adapterObiecte = new AdapterObiecte(softBar);
        printeaza(adapterObiecte, 230);
    }
}
