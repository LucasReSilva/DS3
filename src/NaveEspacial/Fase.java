package NaveEspacial;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public  class Fase extends JPanel implements ActionListener {  
	//plano de fundo da fase
	private Image fundo;
	//objeto nave
	private Nave nave;
        private Telainicial tela;
	//variavel para velocidade do jogo
	private Timer timer;
	//lista de inimigos
	private List<Inimigo> inimigos;	

    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public List<Inimigo> getInimigos() {
        return inimigos;
    }

    public void setInimigos(List<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

    public boolean isEmJogo() {
        return emJogo;
    }

    public void setEmJogo(boolean emJogo) {
        this.emJogo = emJogo;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
	//saber se o jogo acabou
	private boolean emJogo; 
        // dificuldade do jogo
        private int dificuldade =1;
        private int cont =1;
        // numero de vidas
        private int vidas = 5;
        // numero de fases
        private int fase= 1;
        // variavel para o record
        private int record= 0;
        // varialvel para o limete de coordenadas dos inimigos
        private int limite= 800;
        // varialvel do nome do jogador
        private String nomejogador = "Anônimo";
        private String MSG_QUAL_NOME = "Parabéns seu Recorde esta entre os dez melhores!!\n qual é seu nome?";
       
	//iniciando o construtor da fase
	public Fase( ) throws IOException {
		//focus direto na fase
		setFocusable(true);
		setDoubleBuffered(true);
		//adicionando eventos do teclado
		addKeyListener(new TecladoAdapter());
		//carregando a imagem de fundo
                ImageIcon referencia = new ImageIcon("imagem/fundo000.png");
		fundo = referencia.getImage();
		//inciando o objeto nave
		nave = new Nave(1,150);
                tela = new Telainicial();
		//dizendo que o jogo começou
		emJogo = true;
		//carregando os inimigos
		inicializaInimigos(10,"imagem/inimigo_2.png","imagem/inimigo_2.png");
		//definindo delay jogo
		timer = new Timer(10, this);
		//iniciando
		timer.start();
                
	}
        //passando as coordenadas aleatoria para o nascimento dos inimigos
         int rand1(int limite){
            Random random = new Random();  
            int resultado = random.nextInt(limite) + limite ;  
            return resultado;
       }
         int rand2(){
            Random random = new Random();  
            int resultado = random.nextInt(460);
            return resultado;
       }
 
	//metodo para iniciar os inimigos, nas coordenadas geradas
	public void inicializaInimigos(int n,String inimigo1, String inimigo2) {
		inimigos = new ArrayList<>();
		for (int i = 0; i < n; i++) {
                       if (i ==10){
                           limite =1500;
                       }
                       if (i ==20){
                           limite =2000;
                       }
                       if (i ==50){
                           limite =3000;
                       }
                        if (i ==100){
                           limite =4000;
                       }
                         if (i ==200){
                           limite =5000;
                       } if (i ==300){
                           limite =8000;
                       }
			inimigos.add(new Inimigo(rand1(limite), rand2(),inimigo1,inimigo2));                      
		}
                limite = 800;
	}
        void gameover(Graphics g) {     
            Graphics2D graficos = (Graphics2D) g;
            ImageIcon fimJogo = new ImageIcon("imagem/game_over2.png");
            graficos.drawImage(fimJogo.getImage(), 0, 0, null);
       
       
        }   
	//criando o metodo paint, para criar e recriar os movimentos
        @Override
	public void paint(Graphics g) {
		//iniciando objeto graficos, da Classe Graphics2D do java
	     Graphics2D graficos = (Graphics2D) g;
		//inserindo imagem;
	     graficos.drawImage(fundo, 0, 0, null);
		//condição para se ainda houver jogo
	     if (emJogo) {
		//inserindo a nave na posição atual
			graficos.drawImage(nave.getImagem(), nave.getX(), nave.getY(),this);
			//carregando a lista de misseis da nave
			List<Missel> misseis = nave.getMisseis();
			//inserindo na imagem dos misseis da nave
			for (int i = 0; i < misseis.size(); i++) {
				Missel m = (Missel) misseis.get(i);
				graficos.drawImage(m.getImagem(), m.getX(), m.getY(), this);
			}
			//inserindo na imagem os inimigos
			for (int i = 0; i < inimigos.size(); i++) {
				Inimigo in = inimigos.get(i);
				graficos.drawImage(in.getImagem(), in.getX(), in.getY(), this);       
			}
			//inserindo na imagem a quantidade de inimigos restantes
                        graficos.setColor(Color.white);
			graficos.drawString("Inimigos: " + inimigos.size(), 5, 15);
                        graficos.drawString("vidas: " + this.vidas, 100, 15);
                        graficos.drawString("tiro especial: " + nave.tiroespecial, 175, 15);
                        graficos.drawString("Fase Atual: " + this.fase, 300, 15);
                        graficos.drawString("Dificuldade: " + this.dificuldade,400, 15);
                        graficos.drawString("record: " + this.record, 500, 15);
                       
		} else {
                 
                     //imagem do fim do jogo
                        gameover(g);   

		}
		//fechando o objeto de Grafico
		g.dispose();                             
	}	
	//metodos dos eventos
        @Override
	public void actionPerformed(ActionEvent e) {
		if (!this.emJogo   ) {
			emJogo = false;                        
		}else{                    
	//caso ainda tenha jogo
	//carrega a lista de objeto misseis
		List<Missel> misseis = nave.getMisseis();

		//faz cada missel se deslocar na tela
		for (int i = 0; i < misseis.size(); i++) {
			Missel m = (Missel) misseis.get(i);
                       
			if (m.isVisible()) {
			//caso ele seja visivel continua se deslocando
				m.mexer(3);
			} else {
			//caso o missel esteja invisivel, retira do array
				misseis.remove(i);
			}
		}
		//faz os inimigos se deslocar na tela
		for (int i = 0; i < inimigos.size(); i++) {
			Inimigo in = inimigos.get(i);

			if (in.isVisible()) {
				in.mexer(dificuldade);
                               
			} else {
				inimigos.remove(i);
				//caso o inimigo sai da tela, o jogo acaba
                                  if (in.mexer(dificuldade) == false){
                                       vidas--;
                                        if (vidas <0){
                                      this.emJogo = in.mexer(dificuldade);
                                      
                                        }
                                  }
			}
		}
		//faz a nave se mecher
		nave.mexer();
		//checa as colisões
		checarColisoes();
                chegarfinal(cont);
		//repinta a tela
		repaint();
                if(!emJogo){
                       
                       if (Integer.parseInt(tela.linha[19]) < record){
                            nomejogador = JOptionPane.showInputDialog(MSG_QUAL_NOME);  
                            if (nomejogador ==null){
                                nomejogador ="Anônimo";
                            }
                            try {
                                 salvaarquivo();
                            } catch (IOException ex) {
                                 Logger.getLogger(Fase.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                 }
                }
	}
                
        }
        
   
        public boolean chegarfinal(int cont){
            if (cont==1){
            this.fase = 1;
            }
        
        if (inimigos.size() == 0 ) {
             vidas++;
             cont++;
             nave.tiroespecial= nave.tiroespecial +5;
             this.fase ++;
             
             if (cont < 5){
                   inicializaInimigos(4*cont,"imagem/inimigo_2.png","imagem/inimigo_2.png");

             }
             if (cont>=5 && cont< 10) {
                   inicializaInimigos(4*cont,"imagem/inimigo_2.png","imagem/inimigo_2.png");
                   dificuldade=2;
                   ImageIcon referencia = new ImageIcon("imagem/fundo01.png");
		   fundo = referencia.getImage();
                
               }
             if (cont>=10 && cont<15) {
                    inicializaInimigos(4*cont,"imagem/inimigo_2.png","imagem/inimigo_1.png");
                    dificuldade=2;
                    ImageIcon referencia = new ImageIcon("imagem/fundo02.png");
		    fundo = referencia.getImage();
               }
             if (cont>= 15 && cont<20) {
                    inicializaInimigos(4*cont,"imagem/inimigo_1.png","imagem/inimigo_3.png");
                    dificuldade=3;
                    ImageIcon referencia = new ImageIcon("imagem/fundo03.png");
		    fundo = referencia.getImage();
               }
               if (cont >=20){
                   inicializaInimigos(4*cont,"imagem/inimigo_3.png","imagem/inimigo_4.png");
                   ImageIcon referencia = new ImageIcon("imagem/fundo04.png");
		   fundo = referencia.getImage();
                   dificuldade=4;
               }
               
               return false;
            }
           
        return true;
        
        }
	public boolean checarColisoes() {
	//capturando as formas  dos objetos
		Rectangle formaNave = nave.getBounds();
		Rectangle formaInimigo;
		Rectangle formaMissel;
		for (int i = 0; i < inimigos.size(); i++) {
			Inimigo tempInimigo = inimigos.get(i);
			formaInimigo = tempInimigo.getBounds();
			//caso a nave tope em algum inimigo, some os dois e o jogo acaba 
			if (formaNave.intersects(formaInimigo)) {
                                dificuldade=1;
				emJogo = false;
                              return emJogo;
			}
                        
		}

		//carregando lista de misseis
		List<Missel> misseis = nave.getMisseis();

		//para cada missel gerado
		for (int i = 0; i < misseis.size(); i++) {
			Missel tempMissel = misseis.get(i);
			//capturando a forma do missel
			formaMissel = tempMissel.getBounds();
		//para cada inimigo no jogo
			for (int j = 0; j < inimigos.size(); j++) {
		
				Inimigo tempInimigo = inimigos.get(j);
				//capturando a forma do inimigo
				formaInimigo = tempInimigo.getBounds();

				//caso o missel tope no inimigo, some os dois
				if (formaMissel.intersects(formaInimigo)) {
                                        record = record + dificuldade*100;
					tempInimigo.setVisible(false);
					tempMissel.setVisible(false);
				}

			}

		}
              return emJogo;
	}

	//metodos do teclado.
	private class TecladoAdapter extends KeyAdapter {
       

		@Override
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
                            if ( !emJogo ){
                                
                            }
                            emJogo = true;
                            record =0;
                            nave = new Nave(1,150);
                            inicializaInimigos(10,"imagem/inimigo_2.png","imagem/inimigo_2.png");
                            dificuldade=1;
                            vidas = 5;
                            ImageIcon referencia =  new ImageIcon("imagem/fundo000.png");
                            fundo = referencia.getImage();
                            cont = 1;
                            limite = 800;
			}
                        
			
			nave.keyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			nave.keyReleased(e);
		}

	}

      public void salvaarquivo() throws IOException{
         FileWriter fw = new FileWriter(new File("Record.txt"),false); 
         BufferedWriter bfw = new BufferedWriter(fw);
        for(int i=1;i<20;i=i+2){
         if (Integer.parseInt(tela.linha[i]) < record){
            bfw.write(nomejogador);
            bfw.newLine();                        
            bfw.write(""+record);
            bfw.newLine(); 
            record= -1;
         }
            bfw.write(tela.linha[i-1]);
            bfw.newLine();                        
            bfw.write(""+tela.linha[i]);
            bfw.newLine(); 
       
        }
 
            bfw.close();          
        }
}
