package state.main;

import state.model.Masa;

public class Main {
//    13. Restaurantul dorește implementarea unui modul pentru gestiunea modului de ocupare al
//    meselor. O masă poate să aibă una din următoarele stări: Rezervata, Ocupata, Libera. Atunci
//    când un client face o rezervare, masa trece in starea Rezervata. Când clientul ridica rezervarea
//    masa trece in starea ocupata, iar când pleacă, masa trece in starea libera.
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.rezervaMasa();
        masa.elibereazaMasa();
        masa.ocupareMasa();
    }
}
