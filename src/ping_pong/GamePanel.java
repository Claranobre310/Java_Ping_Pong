package ping_pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{
	 
	static final int GAME_WIDTH = 1000;	/* O final ta sendo usado pra impedir q a gnt acidentalmente modifique + tarde. Usar a keyword final tbm ajuda o programa a ser executado mais rápido */
	static final int GAME_HEIGHT = (GAME_WIDTH * (5/9)); /* tradicional de uma mesa de ping-pong*/
	static final Dimension SCREEN_SIZE = new Dimension (GAME_WIDTH,GAME_HEIGHT);
	static final int BALL_DIAMETER = 30;
	static final int PADDLE_WIDTH = 40;
	static final int PADDLE_HEIGHT = 100;
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle1;
	Paddle paddle2;
	Bola bola;
	Score score;
	
	GamePanel(){
	}
	public void newBola() {
		
	} /* sempre que chamar ele dá outra bola, p qdo a bola n pegar na bordinha por ex. */
	public void newBorda() {
		
	}
	/*mesma coisa pra borda*/
	public void paint(Graphics g) {
		
	}
	public void draw(Graphics g) {}
	public void move() {
		
	}
	public void checaColisao() {
		
	}
	public void run() {
		
	}
	public class AL extends KeyAdapter{							/* ACTION LISTENER */
		public void keyPressed(KeyEvent e) {
			
		}
		public void keyReleased(KeyEvent e) {
			
		}
	}
	
	
}
