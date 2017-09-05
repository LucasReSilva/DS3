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
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaDireita() {
        System.out.println("mexer nave para direita");

        Nave instance = new Nave();

        instance.teclaPress(KeyEvent.VK_RIGHT);

        Boolean expResult = true;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
        assertEquals(6, instance.x);

    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteDireita() {
        System.out.println("mexer nave para limite da direita");

        Nave instance = new Nave();
        instance.x = 700;

        instance.teclaPress(KeyEvent.VK_RIGHT);

        Boolean expResult = false;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
        assertEquals(1, instance.x);

    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaEsquerda() {
        System.out.println("mexer nave para esquerda");

        Nave instance = new Nave();

        instance.x = 11;
        instance.teclaPress(KeyEvent.VK_LEFT);

        Boolean expResult = true;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
        assertEquals(6, instance.x);

    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteEsquerda() {
        System.out.println("mexer nave para limite da esquerda");

        Nave instance = new Nave();
        instance.x = -1;

        instance.teclaPress(KeyEvent.VK_LEFT);

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

        Nave instance = new Nave();

        instance.teclaPress(KeyEvent.VK_UP);

        Boolean expResult = true;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
        assertEquals(225, instance.y);

    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteSuperior() {
        System.out.println("mexer nave para limite superior");

        Nave instance = new Nave();
        instance.y = -1;

        instance.teclaPress(KeyEvent.VK_UP);

        Boolean expResult = false;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaBaixo() {
        System.out.println("mexer nave para baixo");

        Nave instance = new Nave();

        instance.teclaPress(KeyEvent.VK_DOWN);

        Boolean expResult = true;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
        assertEquals(235, instance.y);

    }

    /**
     * Test of mexer method, of class Nave.
     */
    @Test
    public void testMexerParaLimiteInferior() {
        System.out.println("mexer nave para limite inferior");

        Nave instance = new Nave();
        instance.y = 461;

        instance.teclaPress(KeyEvent.VK_DOWN);

        Boolean expResult = false;
        Boolean result = instance.mexer();

        assertEquals(expResult, result);
    }

}
