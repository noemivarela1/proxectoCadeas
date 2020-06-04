/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Noemí
 */
public class CadeasTest {
    
    public CadeasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Disabled
    @Test
    public void testENumeroEnt() {
        System.out.println("eNumeroEnt");
        String str = "23.5";
        boolean expResult = false;
        boolean result = Cadeas.eNumeroEnt(str);
        assertEquals(expResult, result);
        String str2="1214";
        boolean expResult2=true;
        boolean result2=Cadeas.eNumeroEnt(str2);
        assertEquals(expResult2,result2);
        String str3="0";
        boolean expResult3=true;
        boolean result3=Cadeas.eNumeroEnt(str3);
        assertEquals(expResult3,result3);
    }

    @Disabled
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cadeas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numVogais method, of class Cadeas.
     */
    @Test
    public void testNumVogais() {
        System.out.println("numVogais");
        String str = "";
        int expResult = 0;
        int result = Cadeas.numVogais(str);
        assertEquals(expResult, result);
        String str2 = "aeiou";
        int expResult2 = 5;
        int result2 = Cadeas.numVogais(str2);
        assertEquals(expResult2, result2);
        String str3 = "murciela G o";
        int expResult3 = 5;
        int result3 = Cadeas.numVogais(str3);
        assertEquals(expResult3, result3);
        String str4 = "1234";
        int expResult4 = 1;
        int result4 = Cadeas.numVogais(str4);
        assertNotEquals(expResult4, result4);
 
    } 
}
