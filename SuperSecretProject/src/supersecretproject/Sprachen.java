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
public class Sprachen {
    
    private ArrayList<Sprache> sprachen;
    
    public Sprachen(ArrayList<Sprache> sprachen){
        
        this.sprachen = sprachen;
    }

    /**
     * @return the sprachen
     */
    public ArrayList<Sprache> getSprachen() {
        return sprachen;
    }

    /**
     * @param sprachen the sprachen to set
     */
    public void setSprachen(ArrayList<Sprache> sprachen) {
        this.sprachen = sprachen;
    }
    
}
