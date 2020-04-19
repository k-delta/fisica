package fisica.Vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import fisica.Logica.Nave;

public class Dibujar extends JPanel {
private Nave nave;
	/**
	 * Create the panel.
	 */
	public Dibujar() {
		setBackground (Color.WHITE); //color de fondo del juego
		nave=new Nave();
		Timer time=new Timer();//velocidad
		try {
			time.wait(100);//cuanto esperar para moverse mils
			nave.mover();
			//if(altura/vlancha*cos(&)=dy) {
				time.cancel();
			//}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D) g;
		g2.drawImage(nave.tenerImagen(), nave.tenerx(), nave.tenery(), null);
	}
}
