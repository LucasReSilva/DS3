package NaveEspacial;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Missel extends Movimentavel {

    //iniciando largura da tela e velocidade do missel
    private static final int LARGURA_TELA = 745;
    private int VELOCIDADE = 10;

    //construtor missel, recebendo a posição da nave
    public Missel(int x, int y) {
        this.x = x;
        this.y = y;

        //carregando imagem do missel
        ImageIcon referencia = new ImageIcon("imagem/missel.png");

        //capturando dimensões do missel
        imagem = referencia.getImage();

        this.largura = imagem.getWidth(null);
        this.altura = imagem.getHeight(null);

        //deixando missel visivel
        visible = true;
    }

    //movimentando o missel, na tela, na velocidade inserida, e até a largura da tela
    public void mexer(int a) {
        this.x += this.VELOCIDADE;
        if (this.x > LARGURA_TELA) {
            visible = false;
        }
    }

    //criando um rentagulo do missel, para melhorar a precisão do toque com outro objeto.
    public Rectangle getBounds() {
        return new Rectangle(x, y, largura, altura);

    }

    //verifcando se o missel está visivel ou não
    public boolean isVisible() {
        return visible;
    }

    //inserir visibilidade ou não no missel
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    //capturando a imagem
    public Image getImagem() {
        return imagem;
    }

    //capturando largura do movimento
    public int getX() {
        return x;
    }

    //capturando altura do movimento
    public int getY() {
        return y;
    }

    @Override
    //capturando altura do missel
    public int getAltura() {
        return altura;
    }

    @Override

    //capturando largura do missel
    public int getLargura() {
        return largura;
    }

    @Override
    public boolean isVisivel() {
        return visible;
    }

    @Override
    public void setVisivel(boolean visivel) {
        visible = visivel;

    }

}
