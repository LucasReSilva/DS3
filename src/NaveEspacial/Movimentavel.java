package NaveEspacial;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Movimentavel {

	protected int x, y;
	protected int altura, largura;
	protected boolean visible;
	protected Image imagem;
	
	public abstract Rectangle getBounds();
	
	public abstract int getX();
	public abstract int getY();
	public abstract int getAltura();
	public abstract int getLargura();
	public abstract boolean isVisivel();
	public abstract void setVisivel(boolean visivel);
	public abstract Image getImagem();
	
	
}
