package Conexion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	Connection con2 = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					Inicio frame = new Inicio();
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
	
	public Inicio() {
		
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setForeground(SystemColor.inactiveCaptionBorder);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo-UIP-jpg.jpg"));
		setTitle("Planilla de Empleados Universidad Interamericana de Panama");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 479);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(111, 47, 96, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_1.setBounds(111, 113, 140, 37);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 26));
		textField.setBounds(281, 47, 159, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 26));
		passwordField.setBounds(281, 113, 159, 37);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char [] clave = passwordField.getPassword();
				String claveFinal = new String(clave);
				
				if(textField.getText().equals("Admin1234") && claveFinal.equals("Admin1234")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Bienvenido al Sistema ", " INGESASTE CORRECTAMENTE",
							JOptionPane.INFORMATION_MESSAGE);
					con2 = Access.obtenerConexion();
					
	
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta ", " ERROR",
							JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
					textField.requestFocus();
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.setBounds(301, 179, 121, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo-UIP-jpg.jpg"));
		btnNewButton_1.setBounds(50, 303, 505, 97);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo-UIP-jpg.jpg"));
		btnNewButton_2.setBounds(50, 0, 487, 265);
		contentPane.add(btnNewButton_2);
	}
}
