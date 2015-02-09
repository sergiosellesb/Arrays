/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vesprada
 */
public class MetodosTest {
    
    public MetodosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inicio method, of class Metodos.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        Metodos.inicio();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CrearVector method, of class Metodos.
     */
    @Test
    public void testCrearVector() {
        System.out.println("CrearVector");
        Metodos.CrearVector();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of MenorMayor method, of class Metodos.
     */
    @Test
    public void testMenorMayor() {
        System.out.println("MenorMayor");
        char[] expResult = {'1','2','3'};
        char[] result = Metodos.MenorMayor();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of MayorMenor method, of class Metodos.
     */
    @Test
    public void testMayorMenor() {
        System.out.println("MayorMenor");
        char[] expResult = null;
        char[] result = Metodos.MayorMenor();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Menor method, of class Metodos.
     */
    @Test
    public void testMenor() {
        System.out.println("Menor");
        char expResult = 49;
        char result = Metodos.Menor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Mayor method, of class Metodos.
     */
    @Test
    public void testMayor() {
        System.out.println("Mayor");
        char expResult = 51;
        char result = Metodos.Mayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of Palindromo method, of class Metodos.
     */
    @Test
    public void testPalindromo() {
        System.out.println("Palindromo");
        boolean expResult = false;
        boolean result = Metodos.Palindromo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Iguales method, of class Metodos.
     */
    @Test
    public void testIguales() {
        System.out.println("Iguales");
        String comparacion = "";
        boolean expResult = false;
        boolean result = Metodos.Iguales(comparacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Copiar method, of class Metodos.
     */
    @Test
    public void testCopiar() {
        System.out.println("Copiar");
        char[] expResult = null;
        char[] result = Metodos.Copiar();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of Media method, of class Metodos.
     */
    @Test
    public void testMedia() {
        System.out.println("Media");
        char expResult = ' ';
        char result = Metodos.Media();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Metodos.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Metodos.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
