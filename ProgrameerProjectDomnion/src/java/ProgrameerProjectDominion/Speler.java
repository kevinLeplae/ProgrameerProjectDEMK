/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrameerProjectDominion;

/**
 *
 * @author Pc_Kevin
 */
public class Speler {
    private String naam;
    private int actiePunten;
    private int koopPunten;
    private Deck foldDeck;
    private Deck drawDeck;
    
    
    
    public Speler(String naam)
    {
       this.naam = naam;
       koopPunten = 1;
       actiePunten = 1;
       foldDeck = new Deck();
       drawDeck = new Deck("startdeck");
       
    }
    
        public String geefNaam()
    {
        return naam;
    }    
        
    public int geefActiePunten()
    {
        return actiePunten;
    }
    
    public int geefKoopPunten()
    {
        return koopPunten;
    }
    
}
