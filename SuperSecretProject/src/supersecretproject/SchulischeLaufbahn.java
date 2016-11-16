/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supersecretproject;

import java.util.ArrayList;

/**
 *
 * @author Inozenz
 */
public class SchulischeLaufbahn {
    
    private ArrayList<Ausbildung> ausbildung;
    
    public SchulischeLaufbahn(ArrayList<Ausbildung> ausbildung){
        this.ausbildung = ausbildung;
    }
    

    /**
     * @return the ausbildung
     */
    public ArrayList<Ausbildung> getAusbildung() {
        return ausbildung;
    }

    /**
     * @param ausbildung the ausbildung to set
     */
    public void setAusbildung(ArrayList<Ausbildung> ausbildung) {
        this.ausbildung = ausbildung;
    }
    
}
