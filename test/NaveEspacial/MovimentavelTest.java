/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaveEspacial;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brenno
 */
public class MovimentavelTest {

    public MovimentavelTest() {
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
    //ItemDaVenda mock1 = null;
    @Before
    public void inicializa() {
        //Criando os Mocks
        //mock1= EasyMock.createMock(ItemDaVenda.class);
    }

    @Test
    public void obterTotalTest() throws IOException {
        Fase fase = new Fase();
        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");

        // fase.setInimigos((List<Inimigo>) inimigo);
        // ItemDaVenda mock1 = EasyMock.createNiceMock(ItemDaVenda.class);
        //EasyMock.expect(mock1.obterSubTotal()).andReturn((float)3.0);
        //EasyMock.replay(mock1);
//		venda.getItensDaVenda().add(mock1);
        //assertEquals(10,10, 0.001);
        assertTrue(fase.chegarfinal(1));

        //verify();
        //reset();
    }

}
