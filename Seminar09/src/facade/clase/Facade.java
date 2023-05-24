package facade.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        this.medic.adaugaPacient(new Pacient("Andrei Cotoi", 8));
        this.medic.adaugaPacient(new Pacient("Ciutacu Claudia", 2));
        this.medic.adaugaPacient(new Pacient("Cozma Ciprian", 10));

        this.salon = new Salon();
        this.salon.adaugaPatLiber(92);
        this.salon.adaugaPatLiber(232);
        this.salon.adaugaPatLiber(96);
    }

    //imparteam in mai multe if uri si dadeam mesaje sugestive pe else.
    public void interneazaPacient(String nume) {
        if (medic.verificaTrimitere(medic.getPacient(nume))) {
            if (salon.verificaPaturiLibere()) {
                if (medic.getPacient(nume).getGravitate() > 4) {
                    salon.ocupaPat();
                    System.out.println(nume + " a fost internat");
                } else {
                    System.out.println("Nu este grav");
                }
            } else {
                System.out.println("Nu exista paturi libere.");
            }
        } else {
            System.out.println("Pacientul nu are trimitere.");
        }
    }
}