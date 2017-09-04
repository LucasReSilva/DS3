package NaveEspacial;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Inimigo extends Movimentavel{
	// velocidade do inimigo
	//private static final int LARGURA_TELA = 800;
	public int VELOCIDADE = 1;
	//variavel da quantidade de inimigos existentes
	private static int contador = 0;
        private Image imagemm;
        private int controle=0;
	
	//iniciando construtor de inimigos, passando uma posição para eles nascer 
	public Inimigo(int x, int y, String inimigo2,String inimigo1){
		this.x = x;
		this.y = y;
		
	//alternando a imagem dos inimigos, para misturar	
		ImageIcon referencia;
               
		if(contador++ % 3 == 0){
			referencia = new ImageIcon(inimigo2); //"imagem/inimigo_2.png"
		} else {
			referencia = new ImageIcon(inimigo1);//"imagem/inimigo_1.png"
		}
		
		//capturando dimensão do inimigo
		imagem = referencia.getImage();
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
		
		visible = true;
	}

    Inimigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	//metodo para quando o inimigo passar da tela, sumir e retornar que o jogo acabou
	public boolean mexer(int a){
		
		if(this.x < 0){
			this.visible = false;
                        return false;
		} else {
		//caso não passe da tela, ele se movimenta de acordo com a velocidade
			this.x -= a;
                        if(10 >=controle){
                        
                            this.y -=a;
                    }
                        if (controle < 21 && controle>10){
                             this.y+=a;
                        }
                        if (controle ==21){
                              controle =0;
                        }
                        
                        controle++;
                        return true;
		}
           
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
		
	}
	

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public Image getImagem() {
		return imagem;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int getAltura() {
		return altura;
	}

	@Override
	public int getLargura() {
		return largura;
	}

	@Override
	public boolean isVisivel() {
		return visible;
	}

	@Override
	public void setVisivel(boolean visivel) {
		this.visible = visivel;
		
	}
	
	
	
	
}
