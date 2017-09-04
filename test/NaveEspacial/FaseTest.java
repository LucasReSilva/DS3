/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaveEspacial;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class FaseTest {
    
    public FaseTest() {
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
     * Test of getNave method, of class Fase.
     */
    @Test
    public void testGetNave() {
        try {
            System.out.println("getNave");
            Fase instance = new Fase();
            Nave expResult = null;
            Nave result = instance.getNave();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setNave method, of class Fase.
     */
    @Test
    public void testSetNave() {
        try {
            System.out.println("setNave");
            Nave nave = null;
            Fase instance = new Fase();
            instance.setNave(nave);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getInimigos method, of class Fase.
     */
    @Test
    public void testGetInimigos() {
        try {
            System.out.println("getInimigos");
            Fase instance = new Fase();
            List<Inimigo> expResult = null;
            List<Inimigo> result = instance.getInimigos();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setInimigos method, of class Fase.
     */
    @Test
    public void testSetInimigos() {
        try {
            System.out.println("setInimigos");
            List<Inimigo> inimigos = null;
            Fase instance = new Fase();
            instance.setInimigos(inimigos);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of isEmJogo method, of class Fase.
     */
    @Test
    public void testIsEmJogo() {
        try {
            System.out.println("isEmJogo");
            Fase instance = new Fase();
            boolean expResult = false;
            boolean result = instance.isEmJogo();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setEmJogo method, of class Fase.
     */
    @Test
    public void testSetEmJogo() {
        try {
            System.out.println("setEmJogo");
            boolean emJogo = false;
            Fase instance = new Fase();
            instance.setEmJogo(emJogo);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getDificuldade method, of class Fase.
     */
    @Test
    public void testGetDificuldade() {
        try {
            System.out.println("getDificuldade");
            Fase instance = new Fase();
            int expResult = 0;
            int result = instance.getDificuldade();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setDificuldade method, of class Fase.
     */
    @Test
    public void testSetDificuldade() {
        try {
            System.out.println("setDificuldade");
            int dificuldade = 0;
            Fase instance = new Fase();
            instance.setDificuldade(dificuldade);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getVidas method, of class Fase.
     */
    @Test
    public void testGetVidas() {
        try {
            System.out.println("getVidas");
            Fase instance = new Fase();
            int expResult = 0;
            int result = instance.getVidas();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setVidas method, of class Fase.
     */
    @Test
    public void testSetVidas() {
        try {
            System.out.println("setVidas");
            int vidas = 0;
            Fase instance = new Fase();
            instance.setVidas(vidas);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of getFase method, of class Fase.
     */
    @Test
    public void testGetFase() {
        try {
            System.out.println("getFase");
            Fase instance = new Fase();
            int expResult = 0;
            int result = instance.getFase();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of setFase method, of class Fase.
     */
    @Test
    public void testSetFase() {
        try {
            System.out.println("setFase");
            int fase = 0;
            Fase instance = new Fase();
            instance.setFase(fase);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of rand1 method, of class Fase.
     */
    @Test
    public void testRand1() {
        try {
            System.out.println("rand1");
            int limite = 0;
            Fase instance = new Fase();
            int expResult = 0;
            int result = instance.rand1(limite);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of rand2 method, of class Fase.
     */
    @Test
    public void testRand2() {
        try {
            System.out.println("rand2");
            Fase instance = new Fase();
            int expResult = 0;
            int result = instance.rand2();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of inicializaInimigos method, of class Fase.
     */
    @Test
    public void testInicializaInimigos() {
        try {
            System.out.println("inicializaInimigos");
            int n = 0;
            String inimigo1 = "";
            String inimigo2 = "";
            Fase instance = new Fase();
            instance.inicializaInimigos(n, inimigo1, inimigo2);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of gameover method, of class Fase.
     */
    @Test
    public void testGameover() {
        try {
            System.out.println("gameover");
            Graphics g = null;
            Fase instance = new Fase();
            instance.gameover(g);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of paint method, of class Fase.
     */
    @Test
    public void testPaint() {
        try {
            System.out.println("paint");
            Graphics g = null;
            Fase instance = new Fase();
            instance.paint(g);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of actionPerformed method, of class Fase.
     */
    @Test
    public void testActionPerformed() {
        try {
            System.out.println("actionPerformed");
            ActionEvent e = null;
            Fase instance = new Fase();
            instance.actionPerformed(e);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of chegarfinal method, of class Fase.
     */
    @Test
    public void testChegarfinal() {
        try {
            System.out.println("chegarfinal");
            int cont = 0;
            Fase instance = new Fase();
            boolean expResult = false;
            boolean result = instance.chegarfinal(cont);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of checarColisoes method, of class Fase.
     */
    @Test
    public void testChecarColisoes() {
        try {
            System.out.println("checarColisoes");
            Fase instance = new Fase();
            Boolean expResult = null;
            Boolean result = instance.checarColisoes();
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
        } catch (IOException ex) {
            Logger.getLogger(FaseTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of salvaarquivo method, of class Fase.
     */
    @Test
    public void testSalvaarquivo() throws Exception {
        System.out.println("salvaarquivo");
        Fase instance = new Fase();
        instance.salvaarquivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
