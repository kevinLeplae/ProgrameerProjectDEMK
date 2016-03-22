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
public class Dominion {
    public Speler speler1; 
    public Speler speler2; 
    public Speler speler3; 
    public Speler speler4; 
    public Vooraad spelVooraad;

    public Dominion (String naam1, String naam2, String naam3, String naam4)
    {
        speler1 = new Speler(naam1);
        speler2 = new Speler(naam2);
        speler3 = new Speler(naam3);
        speler4 = new Speler(naam4);
        spelVooraad = new Vooraad();
    }
    public Dominion (String naam1, String naam2, String naam3)
    {
        this( naam1, naam2, naam3, null);
    }
    
    public Dominion (String naam1, String naam2)
    {
        this( naam1, naam2, null, null);
    }
        
}
