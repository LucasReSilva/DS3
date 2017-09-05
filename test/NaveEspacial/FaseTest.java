/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaveEspacial;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Brenno
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
     * Test of getBounds method, of class Movimentavel.
     */
    Nave mock1 = null;

    @Before
    public void inicializa() {
        //Criando os Mocks
        mock1 = EasyMock.createMock(Nave.class);

    }

    @Test
    public void chegarFinalTestPrimeirafaseCom1inimigo() throws IOException {
        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().add(inimigo);
        assertTrue(fase.chegarfinal(1));

    }

    @Test
    public void chegarFinalTest3faseCom0inimigo() throws IOException {
        /* Missel missil=new Missel(100,100);
                List<Missel> misseis= new ArrayList<>();
                misseis.add(missil);
                EasyMock.expect(mock1.getMisseis()).andReturn(misseis);*/

        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        //inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().clear();

        assertFalse(fase.chegarfinal(3));

    }

    @Test
    public void chegarFinalTest6faseCom0inimigo() throws IOException {
        /* Missel missil=new Missel(100,100);
                List<Missel> misseis= new ArrayList<>();
                misseis.add(missil);
                EasyMock.expect(mock1.getMisseis()).andReturn(misseis);*/

        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        //inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().clear();
        assertFalse(fase.chegarfinal(6));

    }

    @Test
    public void chegarFinalTest11faseCom0inimigo() throws IOException {
        /* Missel missil=new Missel(100,100);
                List<Missel> misseis= new ArrayList<>();
                misseis.add(missil);
                EasyMock.expect(mock1.getMisseis()).andReturn(misseis);*/

        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        //inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().clear();
        assertFalse(fase.chegarfinal(11));

    }

    @Test
    public void chegarFinalTest16faseCom0inimigo() throws IOException {
        /* Missel missil=new Missel(100,100);
                List<Missel> misseis= new ArrayList<>();
                misseis.add(missil);
                EasyMock.expect(mock1.getMisseis()).andReturn(misseis);*/

        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        //inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().clear();
        assertFalse(fase.chegarfinal(16));

    }

    @Test
    public void chegarFinalTest21faseCom0inimigo() throws IOException {
        /* Missel missil=new Missel(100,100);
                List<Missel> misseis= new ArrayList<>();
                misseis.add(missil);
                EasyMock.expect(mock1.getMisseis()).andReturn(misseis);*/
        Fase fase = new Fase();

        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        List<Inimigo> inimigos = new ArrayList<>();
        //inimigos.add(inimigo);
        EasyMock.expect(mock1.getTiroespecial()).andReturn(15);
        EasyMock.expect(mock1.AddTiroespecial()).andReturn(true);
        EasyMock.replay(mock1);
        fase.setNave(mock1);
        fase.getInimigos().clear();
        assertFalse(fase.chegarfinal(21));

    }

}
