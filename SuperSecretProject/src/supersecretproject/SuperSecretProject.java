
package supersecretproject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;


public class SuperSecretProject {


    public static void main(String[] args) {
        
        Anschrift anschrift = new Anschrift("Hartmannstr","8b","45884","Gelsenkirchen");
        PersoenlicheDaten pDaten = new PersoenlicheDaten("Haluk","Keskin",anschrift,"015753410815","zukasa@web.de","10.07.1991");
        
        Beruf b1 = new Beruf("Mai 2006","April 2007","Poresi","Support","");
        Beruf b2 = new Beruf("Mai 2007","April 2008","Cola","Senior Support","");
        Beruf b3 = new Beruf("Mai 2008","April 2009","Pepsi","Major Support","");
        
        ArrayList<Beruf> berufe = new ArrayList<Beruf>();
        berufe.add(b1);
        berufe.add(b2);
        berufe.add(b3);        
        BeruflicheLaufbahn bLaufbahn = new BeruflicheLaufbahn(berufe);
        
        Ausbildung a1 = new Ausbildung("Mai 2003","April 2004","DOTA","Master Baiter");
        Ausbildung a2 = new Ausbildung("Mai 2004","April 2005","RIOT","IT-NOOB");
        
        ArrayList<Ausbildung> ausbildung = new ArrayList<Ausbildung>();
        ausbildung.add(a1);
        ausbildung.add(a2);        
        SchulischeLaufbahn sLaufbahn = new SchulischeLaufbahn(ausbildung);
        
        Sprache s1 = new Sprache("englisch","5");
        Sprache s2 = new Sprache("deutsch","3");
        
        ArrayList<Sprache> sprachen = new ArrayList<Sprache>();
        sprachen.add(s1);
        sprachen.add(s2);
        
        Sprachen s = new Sprachen(sprachen);
        
        KenntnisseUndFaehigkeiten kFaehigkeiten = new KenntnisseUndFaehigkeiten(s, "Word", "Klasse Z");
        
        
        
        
        
        
        
        Lebenslauf ll = new Lebenslauf(pDaten,bLaufbahn,sLaufbahn,kFaehigkeiten);
        
        LebenslaufOutputter lo =  new LebenslaufOutputter(ll);
        lo.print();
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(ll);
        
        String json = gson.toJson(ll);
        System.out.println(json);
        
        
    }
    
    
}
