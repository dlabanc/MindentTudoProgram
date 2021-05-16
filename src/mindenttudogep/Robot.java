package mindenttudogep;

import java.util.ArrayList;
import java.util.Arrays;

public class Robot {

    ArrayList<String> adatok = new ArrayList<>();
    int[] lottoSzamok = new int[5];
    ArrayList<String> mondasok = new ArrayList<>();

    int[] lottoSzamokatGeneral() {
        for (int i = 0; i < 5; i++) {
            int szam = (int) (Math.random() * 90);
            lottoSzamok[i] = szam;
        }
        return lottoSzamok;
    }

    void AktualisLottoSzamok() {
        System.out.print("A megjátszható lottószámok:");
        String szamok = Arrays.toString(lottoSzamokatGeneral());
        System.out.println(szamok);
        adatok.add(szamok);

    }

    void mutatKorabbiak() {
        System.out.print("Korábbi számok: ");
        System.out.println(adatok);
    }

    String adjonEgyMondast() {
        int rnd = (int)(Math.random()*mondasok.size());
        return mondasok.get(rnd);
    }

    void felveszUjMondast(String mondas) {
        mondasok.add(mondas);
    }

}
