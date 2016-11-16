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
public class BeruflicheLaufbahn {
    
    private ArrayList<Beruf> berufe;
    
    public BeruflicheLaufbahn(ArrayList<Beruf> berufe){
        
        this.berufe = berufe;
    }

    /**
     * @return the berufe
     */
    public ArrayList<Beruf> getBerufe() {
        return berufe;
    }

    /**
     * @param berufe the berufe to set
     */
    public void setBerufe(ArrayList<Beruf> berufe) {
        this.berufe = berufe;
    }
    
}
