package strategy.main;

import strategy.model.Operator;
import strategy.model.VerificarePersoanaJuriudica;

public class Main {
//    11. Atunci când un client vine la banca, procesarea documentelor se realizează în funcție de tipul
//    de client. Pentru clienții persoane fizice se solicită doar buletinul și adeverință de la munca, iar
//    pentru clienții persoane juridice se solicita actele de înființare a firmei precum si dovada
//    înregistrării la Registrul comerțului. Sa se implementeze modulul de verificare acte, știindu-se
//    faptul că un client anunță când ajunge la ghișeu ce fel de client este. Deci stabilirea modului de
//    procesare se stabilește la run-time.
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();
        operator.setModVerificare(new VerificarePersoanaJuriudica());
        operator.verificaClient();
    }
}
