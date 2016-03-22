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
public class Vooraad {
    private String[] soortenKaarten;
    private int[] aantalKaarten;
    
    public Vooraad()
    {
        //soortenKaarten = new String[17];
        String[] soortenKaarten = {"koper","zilver","goud","landgoed","hertogdom","provencie","curse","kelder","markt","militie","mijn","slotgracht","verbouwing","smidse","dorp","houthakker","werkplaats"};
        aantalKaarten = new int[17];
        for (int i = 0; i < aantalKaarten.length; i++)
        {
         aantalKaarten[i]=10;
        }
    }
    
    public int geefAantalKaartenVanPlaats(int index)
    {
        return aantalKaarten[index];
    }
    
}
