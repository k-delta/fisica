package fisica.Logica;
import java.util.*;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;



public class Nave {
	private String nave="/imagen/estatua.png";//la estatua quien se mueve
	int dx;
	int dy;
	int x;
	int y;
	int pruf;
	private Image imagen;
	
	public static void main(String[] args) {
		Nave a = new Nave();
	}
	
	public Nave() {
		x=(int) (Math.random()*940+1);//valores donde inicia 
		y=85;
		ImageIcon img= new ImageIcon(this.getClass().getResource(nave));
		imagen=img.getImage();
		System.out.println(x);
	}
	public void mover() { //cuanto avanza
		//si angulo+(&)
		x+=dx;//vlancha*sen(&)+vrio
		y+= dy;//-vlancha*cos(&)
	}
	public int tenerx() {
		return x;
	}
	public int tenery() {
		return y;
	}
	public Image tenerImagen() {
		return imagen;
	}
	
}
