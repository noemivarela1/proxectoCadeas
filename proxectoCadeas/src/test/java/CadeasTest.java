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
    
}
