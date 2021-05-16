package mindenttudogep;

public class MindentTudoGep {

    public static void main(String[] args) {
        
        
        Robot gep = new Robot();
        
        gep.mondasok.add("Addig jár a korsó a kútra, míg el nem törik!");
        gep.mondasok.add("Ki mint veti ágyát, úgy alussza álmát!");
        gep.mondasok.add("Sok lúd disznót győz!");
                
        gep.lottoSzamokatGeneral();
        
        for (int i = 0; i < Math.random()*10; i++) {
            System.out.print(i+1 + ". Hét megjátszható számai: ");
            gep.AktualisLottoSzamok();
        }
        
        
        gep.mutatKorabbiak();
        
        gep.felveszUjMondast("Minden kezdet nehéz!");
        gep.felveszUjMondast("Jobb egy lúdnyak, tíz tyúknyaknál!");
        gep.felveszUjMondast("Ki sokat markol, keveset fog!");
        
        String mondas = gep.adjonEgyMondast();
        System.out.println("Aktuális mondás: " + mondas);
        
        
    }
    
}
