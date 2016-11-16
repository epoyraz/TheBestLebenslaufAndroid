/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supersecretproject;

/**
 *
 * @author Inozenz
 */
public class KenntnisseUndFaehigkeiten {
    
    private Sprachen fremdSprachen;
    private String pcKenntnisse;
    private String fuehrerschein;
    
    public KenntnisseUndFaehigkeiten(Sprachen fremdSprachen, String pcKenntnisse, String fuehrerschein){
        
        this.fremdSprachen = fremdSprachen;
        this.pcKenntnisse = pcKenntnisse;
        this.fuehrerschein = fuehrerschein;
        
    }

    /**
     * @return the pcKenntnisse
     */
    public String getPcKenntnisse() {
        return pcKenntnisse;
    }

    /**
     * @param pcKenntnisse the pcKenntnisse to set
     */
    public void setPcKenntnisse(String pcKenntnisse) {
        this.pcKenntnisse = pcKenntnisse;
    }

    /**
     * @return the fuehrerschein
     */
    public String getFuehrerschein() {
        return fuehrerschein;
    }

    /**
     * @param fuehrerschein the fuehrerschein to set
     */
    public void setFuehrerschein(String fuehrerschein) {
        this.fuehrerschein = fuehrerschein;
    }
    
}
