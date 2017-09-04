package NaveEspacial;

import NaveEspacial.Missel;
import NaveEspacial.Movimentavel;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


public interface NaveInterface {
public int getTiroespecial();
   

    public Boolean AddTiroespecial();
  
	//metodo para a nave não sair da tela
	public void mexer() ;

	/*metodo para atirar, aqui é criado um novo missel, e adicionado no array da nave, passando
	as dimensões da nave, saindo proporcional a mesma
	*/
	public void atira() ;
                
	
       public void atiraespecial();
	
	

	//aqui é criada uma dimensão retangular da nave, para ficar mais preciso, quanto tocar em outro objeto
	public Rectangle getBounds();

	//metodo para verificar se a nave está visivel ou não
	public boolean isVisivel();

	//metodo para deixar a nave visivel ou não
	public void setVisivel(boolean visible);

	//retornando os misseis
	public List<Missel> getMisseis();

	//retornando a largura do movimento
	public int getX();

	//retornando a altura do movimento
	public int getY();

	//retornando a imagem
	public Image getImagem();

	//retornando a altura da nave
	
	public int getAltura();

	//retornando a largura da nave
	public int getLargura();
        public void keyReleased(KeyEvent tecla);
        public void keyPressed(KeyEvent tecla);
	
}
