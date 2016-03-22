/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrameerProjectDominion;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pc_Kevin
 */
public class TestVooraad {
    public Vooraad spelVooraad;
    
    
@Before
public void setUp()
{
   spelVooraad = new Vooraad();
}
    
@Test
public void aantalKoper()
{
    int aantalKoper = spelVooraad.geefAantalKaartenVanPlaats(1);
    
    assertEquals(10, aantalKoper);
}
    
}
