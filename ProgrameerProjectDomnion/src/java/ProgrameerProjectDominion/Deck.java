/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrameerProjectDominion;
import java.util.*;


/**
 *
 * @author Pc_Kevin
 */
public class Deck {
    private int startKoper;
    private int startVictory;
    private ArrayList <String> deck;
    
    
    public Deck(String soort)
    {
        if(soort == "soort")
        {
            startKoper = 7;
            startVictory = 3;
            deck = new ArrayList();
            //hard coded moet uit database komen 
            deck.add("koper");
            deck.add("koper");
            deck.add("koper");
            deck.add("koper");
            deck.add("koper");
            deck.add("koper");
            deck.add("koper");
            deck.add("landgoed");
            deck.add("landgoed");
            deck.add("landgoed");
        }
    }
    public Deck()
    {
        
    }
}
