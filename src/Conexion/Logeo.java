package Conexion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logeo extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	static Connection con2 = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logeo frame = new Logeo();
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
	public Logeo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 476);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new LineBorder(new Color(128, 0, 128)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Logeo.class.getResource("/imagenes/user2.png")));
		lblNewLabel.setBounds(0, 0, 312, 437);
		contentPane.add(lblNewLabel);
		
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesi\u00F3n_");
		lblIniciarSesion.setForeground(new Color(128, 0, 128));
		lblIniciarSesion.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		lblIniciarSesion.setBounds(416, 67, 181, 55);
		contentPane.add(lblIniciarSesion);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 0, 128));
		separator.setBounds(334, 226, 250, 2);
		contentPane.add(separator);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("");
		txtUsuario.setBorder(null);
		txtUsuario.setAutoscrolls(false);
		txtUsuario.setForeground(new Color(128, 0, 128));
		txtUsuario.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtUsuario.setBackground(UIManager.getColor("Button.background"));
		txtUsuario.setBounds(334, 192, 218, 31);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setForeground(new Color(128, 0, 128));
		lblUsuario.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		lblUsuario.setBounds(334, 133, 109, 55);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setForeground(new Color(128, 0, 128));
		lblContrasea.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		lblContrasea.setBounds(334, 234, 146, 55);
		contentPane.add(lblContrasea);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(128, 0, 128));
		separator_1.setBounds(334, 314, 250, 2);
		contentPane.add(separator_1);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setToolTipText("");
		txtContraseña.setBorder(null);
		txtContraseña.setForeground(new Color(128, 0, 128));
		txtContraseña.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		txtContraseña.setBackground(UIManager.getColor("Button.background"));
		txtContraseña.setBounds(334, 283, 250, 20);
		contentPane.add(txtContraseña);
		
		JButton btnEntrrar = new JButton("");
		btnEntrrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 char [] clave = txtContraseña.getPassword();
			        String claveFinal = new String(clave);

			        if(txtUsuario.getText().equals("Planilla_UIP") && claveFinal.equals("Planilla_UIP1234")) {
			            dispose();
			            JOptionPane.showMessageDialog(null, "Bienvenido al Sistema ", " INGRESASTE",
			                JOptionPane.INFORMATION_MESSAGE);
			            con2 = Access.obtenerConexion();
			           
			        }else {
			            JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta ", " ERROR",
			                JOptionPane.ERROR_MESSAGE);
			            txtUsuario.setText("");
			            txtContraseña.setText("");
			            txtUsuario.requestFocus();
			        }
			
			
			}
			
		});
		btnEntrrar.setContentAreaFilled(false);
		btnEntrrar.setBorderPainted(false);
		btnEntrrar.setIcon(new ImageIcon(Logeo.class.getResource("/imagenes/Sin t\u00EDtulo-6_1.png")));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo UIP.png"));
		btnEntrrar.setBackground(new Color(255, 255, 255));
		btnEntrrar.setForeground(new Color(255, 255, 255));
		btnEntrrar.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		btnEntrrar.setBounds(363, 348, 199, 41);
		contentPane.add(btnEntrrar);
	}
}
