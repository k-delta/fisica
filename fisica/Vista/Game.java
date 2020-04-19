package fisica.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import fisica.Logica.*;
import fisica.Vista.*;

import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class Game extends JFrame {
	//ATRIBUTOS E INSTANCIAS PERTINENTES
	private String nombre;
	private String nombre2;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Game() {
		//CREA Y MODIFICA EL FRAME
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("movimiento relativo");
		setFont(new Font("Lucida Calligraphy", Font.BOLD | Font.ITALIC, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setBounds(0, 960, 960, 544);
		Panel contentPane = new Panel("/images/Jugadores.png");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		
		add(new Dibujar());
	}
	public Game(int x) {
		
	}

	public String getNombre() {
		return nombre;
	}
	public String getNombre2() {
		return nombre2;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}
}
