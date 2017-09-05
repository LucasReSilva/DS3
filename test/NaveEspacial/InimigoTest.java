/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NaveEspacial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Teste de Condicao e Cobertura de Condicao e Decisao
 *
 * @author juan
 */
public class InimigoTest {

    @Test
    public void testMexerCoordenadaXMenorQue0() {
        Inimigo inimigo = new Inimigo(-100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        assertFalse(inimigo.mexer(0));
    }

    @Test
    public void testMexerCoordenadaXMaiorQue0VariavelControleMenorQue10() {
        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        for (int i = 0; i < 5; i++) {
            inimigo.mexer(1);
        }
        assertTrue(inimigo.mexer(0));
    }

    @Test
    public void testMexerCoordenadaXMaiorQue0VariavelControleIgualA10() {
        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        for (int i = 0; i < 10; i++) {
            inimigo.mexer(1);
        }
        assertTrue(inimigo.mexer(0));
    }

    @Test
    public void testMexerCoordenadaXMaiorQue0VariavelControleMaiorQue10EMenorQue21() {
        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        for (int i = 0; i < 15; i++) {
            inimigo.mexer(1);
        }
        assertTrue(inimigo.mexer(0));
    }

    @Test
    public void testMexerCoordenadaXMaiorQue0VariavelControleIgualA21() {
        Inimigo inimigo = new Inimigo(100, 200, "imagem/inimigo_2.png", "imagem/inimigo_2.png");
        for (int i = 0; i < 21; i++) {
            inimigo.mexer(1);
        }
        assertTrue(inimigo.mexer(0));
    }

}
