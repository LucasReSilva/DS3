/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaveEspacial;

import java.awt.Component;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author lucas
 */
public class NaveTest {

    public NaveTest() {
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
     * Test of getTiroespecial method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetTiroespecial() {
        System.out.println("getTiroespecial");
        Nave instance = new Nave();
        int expResult = 0;
        int result = instance.getTiroespecial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddTiroespecial method, of class Nave.
     */
    @Test
    @Ignore
    public void testAddTiroespecial() {
        System.out.println("AddTiroespecial");
        Nave instance = new Nave();
        Boolean expResult = null;
        Boolean result = instance.AddTiroespecial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atira method, of class Nave.
     */
    @Test
    @Ignore
    public void testAtira() {
        System.out.println("atira");
        Nave instance = new Nave();
        instance.atira();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atiraespecial method, of class Nave.
     */
    @Test
    @Ignore
    public void testAtiraespecial() {
        System.out.println("atiraespecial");
        Nave instance = new Nave();
        instance.atiraespecial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   

    /**
     * Test of getBounds method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetBounds() {
        System.out.println("getBounds");
        Nave instance = new Nave();
        Rectangle expResult = null;
        Rectangle result = instance.getBounds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisivel method, of class Nave.
     */
    @Test
    @Ignore
    public void testIsVisivel() {
        System.out.println("isVisivel");
        Nave instance = new Nave();
        boolean expResult = false;
        boolean result = instance.isVisivel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisivel method, of class Nave.
     */
    @Test
    @Ignore
    public void testSetVisivel() {
        System.out.println("setVisivel");
        boolean visible = false;
        Nave instance = new Nave();
        instance.setVisivel(visible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMisseis method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetMisseis() {
        System.out.println("getMisseis");
        Nave instance = new Nave();
        List<Missel> expResult = null;
        List<Missel> result = instance.getMisseis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetX() {
        System.out.println("getX");
        Nave instance = new Nave();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetY() {
        System.out.println("getY");
        Nave instance = new Nave();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagem method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetImagem() {
        System.out.println("getImagem");
        Nave instance = new Nave();
        Image expResult = null;
        Image result = instance.getImagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetAltura() {
        System.out.println("getAltura");
        Nave instance = new Nave();
        int expResult = 0;
        int result = instance.getAltura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLargura method, of class Nave.
     */
    @Test
    @Ignore
    public void testGetLargura() {
        System.out.println("getLargura");
        Nave instance = new Nave();
        int expResult = 0;
        int result = instance.getLargura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class Nave.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent tecla = null;
        Nave instance = new Nave();
        instance.keyPressed(tecla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class Nave.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent tecla = null;
        Nave instance = new Nave();
        instance.keyReleased(tecla);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaDireita() {
        System.out.println("mexer nave para direita");
        
        KeyEvent teclaDireita = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_RIGHT);
        
        Nave instance = new Nave();
        
        System.err.println(instance.getX());
        instance.keyPressed(teclaDireita);

        Boolean expResult = true;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteDireita() {
        System.out.println("mexer nave para limite da direita");
        
        KeyEvent teclaDireita = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_RIGHT);
        
        Nave instance = new Nave();
        instance.x =701;
        
        System.out.println(instance.x);

        Boolean expResult = false;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaEsquerda() {
        System.out.println("mexer nave para esquerda");
        
        KeyEvent teclaEsquerda = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_LEFT);
        
        Nave instance = new Nave();
        
        System.err.println(instance.getX());
        instance.keyPressed(teclaEsquerda);

        Boolean expResult = true;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteEsquerda() {
        System.out.println("mexer nave para limite da esquerda");
        
        KeyEvent teclaEsquerga = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_LEFT);
        
        Nave instance = new Nave();
        instance.x =-1;
        
        System.out.println(instance.x);

        Boolean expResult = false;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaCima() {
        System.out.println("mexer nave para cima");
        
        KeyEvent teclaCima = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_UP);
        
        Nave instance = new Nave();
        
        System.err.println(instance.getY());
        instance.keyPressed(teclaCima);

        Boolean expResult = true;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteSuperior() {
        System.out.println("mexer nave para limite superior");
        
        KeyEvent teclaCima = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_UP);
        
        Nave instance = new Nave();
        instance.y =-1;
        
        System.out.println(instance.y);

        Boolean expResult = false;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaBaixo() {
        System.out.println("mexer nave para cima");
        
        KeyEvent teclaBaixo = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_DOWN);
        
        Nave instance = new Nave();
        
        System.err.println(instance.getY());
        instance.keyPressed(teclaBaixo);

        Boolean expResult = true;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteInferior() {
        System.out.println("mexer nave para limite inferior");
        
        KeyEvent teclaBaixo = new KeyEvent(new Component() {
        }, 1, 1, 0, KeyEvent.VK_DOWN);
        
        Nave instance = new Nave();
        instance.y =461;
        
        System.out.println(instance.y);

        Boolean expResult = false;
        Boolean result = instance.mexer();
        assertEquals(expResult, result);
    }

}
