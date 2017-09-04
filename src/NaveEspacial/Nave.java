package NaveEspacial;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Nave extends Movimentavel{

	private int dx, dy;
	//Uma nave contem um array de misseis
	private List<Missel> misseis;
        private List<Nave> nave;
        public int tiroespecial =50;

	public Nave(int x, int y) {
		
		//carregando a imagem da nave
		ImageIcon referencia = new ImageIcon("imagem/nave.png");
		//capturando as dimensões da imagem
		imagem = referencia.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getHeight(null);

		//iniciando o objeto
		misseis = new ArrayList<>();
                nave = new ArrayList<>();

		//posicão inicial da nave
		this.x = 1;
		this.y = 230;

                
	}

	//metodo para a nave não sair da tela
	public boolean mexer() {
		x += dx;
		y += dy;
                
                Boolean movimentoValido;
                movimentoValido = true;

		if (this.x < 1) {
			this.x = 1;
                        movimentoValido = false;
		}
		if (this.x > 700) {
			this.x = 1;
                        movimentoValido = false;
		}

		if (this.y < 1) {
			this.y = 1;
                        movimentoValido = false;
		}

		if (this.y > 460) {
			this.y = 460;
                        movimentoValido = false;
		}
                return movimentoValido;
	}

	/*metodo para atirar, aqui é criado um novo missel, e adicionado no array da nave, passando
	as dimensões da nave, saindo proporcional a mesma
	*/
	public void atira() {
		this.misseis.add(new Missel(this.x + this.largura, this.y + this.altura
				/ 3 ));
                
	}
        	public void atiraespecial() {
		this.misseis.add(new Missel(this.x + this.largura - 25, this.y + this.altura -15 ));
                this.misseis.add(new Missel(this.x + this.largura -23, this.y + this.altura -60 ));
                this.misseis.add(new Missel(this.x + this.largura, this.y + this.altura/3  ));
                
	}
	
	//aqui são capturados os eventos referente ao teclado, o que faz a nave andar e atirar
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_SPACE) {
			atira();
		}
                if (codigo == KeyEvent.VK_Q) {
                    
                    if (this.tiroespecial >0){
                        
			atiraespecial();
                        this.tiroespecial--;
                    }
                     
                        
		}

		if (codigo == KeyEvent.VK_UP) {
			dy = -5;

		}
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 5;
		}

		if (codigo == KeyEvent.VK_LEFT) {
			dx = -5   ;

		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 5;
		}

	}

	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();

		if (codigo == KeyEvent.VK_UP) {
			dy = 0;

		}
		if (codigo == KeyEvent.VK_DOWN) {
			dy = 0;

		}
		if (codigo == KeyEvent.VK_LEFT) {
			dx = 0;

		}
		if (codigo == KeyEvent.VK_RIGHT) {
			dx = 0;

		}

	}

	//aqui é criada uma dimensão retangular da nave, para ficar mais preciso, quanto tocar em outro objeto
	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);

	}

	//metodo para verificar se a nave está visivel ou não
	public boolean isVisivel() {
		return visible;
	}

	//metodo para deixar a nave visivel ou não
	public void setVisivel(boolean visible) {
		this.visible = visible;
	}

	//retornando os misseis
	public List<Missel> getMisseis() {
		return misseis;
	}

	//retornando a largura do movimento
	public int getX() {
		return x;
	}

	//retornando a altura do movimento
	public int getY() {
		return y;
	}

	//retornando a imagem
	public Image getImagem() {
		return imagem;
	}

	//retornando a altura da nave
	@Override
	public int getAltura() {
		return altura;
	}

	//retornando a largura da nave
	@Override
	public int getLargura() {
		return largura;
	}

}
