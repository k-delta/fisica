package fisica.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import CuatroEnLinea.Vista.Game2;
import CuatroEnLinea.Vista.Panel;
import CuatroEnLinea.Vista.VentanaInicio;
import CuatroEnLinea.Vista.VentanaJugador;

public class Datos extends JFrame {
	//ATRIBUTOS 
	private JTextField TxtNombre;
	private JPanel contentPane;
	private JTextField TxtNombre2;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaJugadores frame = new VentanaJugadores();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setTitle("movimiento relativo");
		setLocationRelativeTo(null);
		setResizable(false);
		setBounds(200, 0, 800, 800);
		Panel contentPane = new Panel("/images/fondoInicio.jpg");
		getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		//CREA LOS COMPONENTES Y LOS POSICIONA EN EL FRAME
		JLabel Titulo = new JLabel("");
		Titulo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/images/TITULO.png")));
		Titulo.setBounds(98, 86, 600, 150);
		contentPane.add(Titulo);
		
		TxtNombre = new JTextField();
		TxtNombre.setBounds(246, 266, 300, 40);
		contentPane.add(TxtNombre);
		TxtNombre.setColumns(10);
		
		JLabel vlancha = new JLabel("Digite la velocidad del barco (m/s)");
		vlancha.setFont(new Font("Agency FB", Font.BOLD, 20));
		vlancha.setBounds(246, 227, 300, 40);
		contentPane.add(vlancha);
		
		JLabel vrio = new JLabel("Digite la velocidad del rio (m/s)");
		vrio.setFont(new Font("Agency FB", Font.BOLD, 20));
		vrio.setBounds(246, 317, 300, 40);
		contentPane.add(vrio);
		
		TxtNombre2 = new JTextField();
		TxtNombre2.setColumns(10);
		TxtNombre2.setBounds(246, 355, 300, 40);
		contentPane.add(TxtNombre2);
		
		//BOTON QUE CAPTURA LOS DATOS DE LOS USUARIOS Y LOS LLEVA AL FRAME DEL JUEGO
		JButton Siguiente = new JButton("");
		Siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!TxtNombre.getText().equals("") && !TxtNombre2.getText().equals("")){
					Game2 g = new Game2();
					g.setNombre(TxtNombre.getText());
					g.setNombre2(TxtNombre2.getText());
					g.setVisible(true);
					g.setAlwaysOnTop(true);
					setVisible(false);
				}else{
					JOptionPane.showMessageDialog(null, "Debe Digitar un valor", "WARNING", JOptionPane.WARNING_MESSAGE);// si v+ y &- valor invalido
				}
			}
		});
		Siguiente.setIcon(new ImageIcon(VentanaJugador.class.getResource("/images/ContinuarV3.jpg")));
		Siguiente.setBounds(246, 471, 300, 40);
		contentPane.add(Siguiente);
	}

}
