package ProgrameerProjectDominion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc_Kevin
 */
public class TestDominion {
        private Dominion spelMetTwee;
        private Dominion spelMetDrie;
        private Dominion spelMetVier;
        
@Before
public void setUp()
{
   //SETUP - ASSIGN
   spelMetTwee= new Dominion("Kevin", "Egon");
   spelMetDrie= new Dominion("Kevin", "Egon","Duncan");
   spelMetVier= new Dominion("Kevin", "Egon","Duncan","Michiel");

}
        
@Test
public void spelMetMeerdereSpelersOpZetten()
{
   String gevondenSpelerUitSpelMetTwee = spelMetTwee.speler1.geefNaam();
   String onbestaandeSpelerUitSpelMetDrie = spelMetDrie.speler4.geefNaam();
   String onbestaandeSpelerUitSpelMetVier = spelMetVier.speler4.geefNaam();
   
    assertEquals("Kevin", gevondenSpelerUitSpelMetTwee);
    assertNull(onbestaandeSpelerUitSpelMetDrie);
    assertEquals("Michiel", onbestaandeSpelerUitSpelMetVier);
}

@Test
public void startPuntenVanSpelers()
{
    int startActiePuntenSpelerEen = spelMetTwee.speler1.geefActiePunten();
    int startKoopPuntenSpelerEen = spelMetTwee.speler1.geefKoopPunten();
    
    assertEquals(1,startActiePuntenSpelerEen);
    assertEquals(1,startKoopPuntenSpelerEen);
}
 

}
