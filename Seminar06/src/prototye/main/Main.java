package prototye.main;

import prototye.models.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> documente = new HashMap<>();
        documente.put("ci", 2);
        documente.put("Adeverinta", 6);

        ContBancar contBancar = new ContBancar("Andrei", documente, 8);
        ContBancar contBancar1 = (ContBancar) contBancar.cloneaza();

        System.out.println(contBancar);
        System.out.println(contBancar1);
    }
}
