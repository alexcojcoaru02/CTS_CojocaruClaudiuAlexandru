package flyweight.main;

import flyweight.clase.Cont;
import flyweight.clase.FlyweightFactory;
import flyweight.clase.IClientBanca;

public class Main {
//    10. Pentru fiecare cont trebuie să se rețină informații cu privire la deținătorul său: nume, adresa,
//    număr de telefon, adresă de mail, etc, precum și informațiile despre bancă: nume, sucursală,
//    capital, etc. Pe lângă aceste informații un cont deține și informații precum număr cont, sumă etc.
//    Astfel, dacă o persoană are mai multe conturi, la fiecare cont informațiile despre deținător sunt
//    aceleași și se repetă, ocupând foarte multă memorie. Să se implementeze modulul de memorare al
//    conturilor astfel încât să nu se ocupe memorie foarte multă.
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();
        Cont cont1 = new Cont(2300, 12);
        Cont cont2 = new Cont(330, 13);
        Cont cont3 = new Cont(5300, 42);

        IClientBanca detinator = fabrica.getDetinator("Ion", "0743738823", "Str principala");
        detinator.descriere(cont1);

        fabrica.getDetinator("Maria", "0789562314", "Ulmi").descriere(cont2);
        fabrica.getDetinator("Ion", "0714253698", "Ghionea").descriere(cont3);
        fabrica.getDetinator("Maria", "0789562314", "Ulmi").descriere(cont1);
    }
}
