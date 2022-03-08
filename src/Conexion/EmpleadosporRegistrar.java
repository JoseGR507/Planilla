package Conexion;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import org.omg.CORBA.portable.ValueBase;
public class EmpleadosporRegistrar extends JFrame{
	JTable tblTabla;
	JScrollPane jspTabla;
	DefaultTableModel dtmTabla;
	String titulos [] = {"Id","Nombre", "Apellido", "Cedula", "Cargo", "Salario Mensual", "Salario Quincenal","Tarifa por Hora", "Horas Trabajadas", "Horas Extras", "Horas por Domingo","Salario neto"};
	JTextField txtNombre, txtApellido, txtCedula, txtCargo, txtId_Empleado,txtBuscar,txtHoras_Trabajadas,txtHoras_Extras, txtSalario_Mensual,txtCalcular,txtSeguro,txtSeguro_Educativo,txtRata_por_Hora,txtDomingo,txtSalario_;
	JLabel lblNombre, lblApellido, lblCedula, lblCargo,lblId_Empleado,lblBuscar,lblHoras_Trabajadas,lblHoras_Extras,lblSalario_Mensual,lblSeguro,lblSeguro_Educativo,lblRata_por_Hora,lblDomingo,lblSalario_;
	JButton btnGuardar, btnNuevo, btnEliminar, btnBuscar, btnCalcular,btnLogo1;
	
	
	public EmpleadosporRegistrar() {
		
		btnGuardar = new JButton("Guardar");
		btnNuevo = new JButton("Nuevo");
		btnEliminar = new JButton("Eliminar");
		btnBuscar = new JButton("Buscar");
		btnCalcular = new JButton("Generar Pago Quincenal");
		btnLogo1 = new JButton("");
		
		txtId_Empleado = new JTextField();
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtCedula = new JTextField();
		txtCargo = new JTextField();
		txtBuscar = new JTextField();
		txtHoras_Trabajadas = new JTextField();
		txtHoras_Extras = new JTextField();
		txtSalario_Mensual = new JTextField();
		txtCalcular = new JTextField();
		txtSeguro = new JTextField();
		txtSeguro_Educativo = new JTextField();
		txtRata_por_Hora = new JTextField();
		txtDomingo = new JTextField();
		txtSalario_ = new JTextField();
		
		lblId_Empleado = new JLabel("Id");
		lblNombre = new JLabel("Nombre");
		lblApellido = new JLabel("Apellido");
		lblCedula = new JLabel("Cedula");
		lblCargo = new JLabel("Cargo");
		lblHoras_Trabajadas = new JLabel("Horas Trabajadas");
		lblHoras_Extras = new JLabel("Horas Extras");
		lblSalario_Mensual = new JLabel("Salario Mensual");
		lblSeguro = new JLabel("Descuento de Seguro Social");
		lblSeguro_Educativo = new JLabel("Descuento de Seguro Educativo");
		lblRata_por_Hora = new JLabel("Tarifa por Hora");
		lblDomingo = new JLabel("Horas por Domingo");
		lblSalario_ = new JLabel("Salario Quincenal");
		
		dtmTabla = new DefaultTableModel(null,titulos);
		tblTabla = new JTable(dtmTabla);
		jspTabla = new JScrollPane(tblTabla);
		
		add(jspTabla);
		
		
		add(txtId_Empleado);
		add(txtNombre);
		add(txtApellido);
		add(txtCedula);
		add(txtCargo);
		add(txtBuscar);
		add(txtHoras_Trabajadas);
		add(txtHoras_Extras);
		add(txtSalario_Mensual);
		add(txtCalcular);
		add(txtSeguro);
		add(txtSeguro_Educativo);
		add(txtRata_por_Hora);
		add(txtDomingo);
		add(txtSalario_);
		add(lblId_Empleado);
		add(lblNombre);
		add(lblApellido);
		add(lblCedula);
		add(lblCargo);
		add(lblHoras_Trabajadas);
		add(lblHoras_Extras);
		add(lblSalario_Mensual);
		add(lblSeguro);
		add(lblSeguro_Educativo);
		add(lblRata_por_Hora);
		add(lblDomingo);
		add(lblSalario_);
		add(btnGuardar);
		add(btnNuevo);
		add(btnEliminar);
		add(btnBuscar);
		add(btnCalcular);
		add(btnLogo1);
		
		jspTabla.setBounds(25,330,1325,325);;

		
		lblId_Empleado.setBounds(85,50,100,25);
		txtId_Empleado.setBounds(200,50,200,25);
		
		lblNombre.setBounds(85,80,100,25);
		txtNombre.setBounds(200,80,200,25);
		
		lblApellido.setBounds(85,110,100,25);
		txtApellido.setBounds(200,110,200,25);
		
		lblCedula.setBounds(85,140,100,25);
		txtCedula.setBounds(200,140,200,25);
		
		lblCargo.setBounds(85,170,100,25);
		txtCargo.setBounds(200,170,200,25);
		
		lblSalario_Mensual.setBounds(85,200,100,25);
		txtSalario_Mensual.setBounds(200,200,200,25);
		
		lblHoras_Trabajadas.setBounds(85,230,110,25);
		txtHoras_Trabajadas.setBounds(200,230,200,25);
		
		lblHoras_Extras.setBounds(85,260,100,25);
		txtHoras_Extras.setBounds(200,260,200,25);
		
		lblDomingo.setBounds(85,290,100,25);
		txtDomingo.setBounds(200,290,200,25);
		
		lblSeguro.setBounds(550,50,200,25);
		txtSeguro.setBounds(550,80,75,25);
		
		lblSeguro_Educativo.setBounds(550,110,200,25);
		txtSeguro_Educativo.setBounds(550,140,75,25);
		
		lblRata_por_Hora.setBounds(425,260,200,25);
		txtRata_por_Hora.setBounds(425,290,75,25);

		lblSalario_.setBounds(550,260,200,25);
		txtSalario_.setBounds(550,290,75,25);
		
		
		btnNuevo.setBounds(425, 50, 100, 25);
		btnEliminar.setBounds(425, 110, 100, 25);
		btnBuscar.setBounds(425, 140, 100, 25);
		txtBuscar.setBounds(425,170,100,25);
		btnCalcular.setBounds(425,200,250,25);
		txtCalcular.setBounds(425,230,250,25);
		btnGuardar.setBounds(425,80,100,25);
		
		
		
		btnLogo1.setIcon(new ImageIcon("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\banner_uip.png"));
		btnLogo1.setBounds(760, 130, 505, 97);

		
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btncalcularActionPerformed(evt);
			}
		});
		
		
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnBuscarActionPerformed(evt);
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnEliminarActionPerformed(evt);
			}
		});
		
		
		
		
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnGuardarActionPerformed(evt);
			}
		});
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnNuevoActionPerformed(evt);
			}
		});
		
		
		tblTabla.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent evt) {
				tblTablaMouseClicked(evt);
			}
			
		});
        
		mostrar("");
	}
		protected void btncalcularActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
			try {
				
				double ss=9.75,se=1.25,hormes=208,fin3,quincenal,recargo=1.25,extras,hext,normal,domingo=1.50,total,bruto,sseguro,sedu,neto;
				int dlabor=313,año=12,fin,fin2,hordia=8,hnormal,dom;
				DecimalFormat df = new DecimalFormat("#.00");
				float salario, tot;
				fin=dlabor/año/2;
				fin2=fin*hordia;
				salario = Float.parseFloat(txtSalario_Mensual.getText());
				fin3=salario/hormes;
				tot=salario/2;
				txtSalario_.setText("      "+df.format(tot));
				txtRata_por_Hora.setText("      "+df.format(fin3));
				hext = Integer.parseInt(txtHoras_Extras.getText());
				extras=recargo*fin3*hext;
				hnormal = Integer.parseInt(txtHoras_Trabajadas.getText());
				normal=fin3*hnormal;
				dom = Integer.parseInt(txtDomingo.getText());
				total=dom*fin3*domingo;
				bruto=normal+total+extras;
				sseguro=(bruto*ss)/100;
				txtSeguro.setText("      "+df.format(sseguro));
				sedu=(bruto*se)/100;
				txtSeguro_Educativo.setText("      "+df.format(sedu));
				neto=bruto-sedu-sseguro;
				txtCalcular.setText("      "+df.format(neto));
			         
		
			    	
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
	
		protected void btnEliminarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		try {
			Connection con = null;
			con = Access.obtenerConexion();
			String sql = "delete from Empleados where Id_Empleado = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, Integer.parseInt(txtId_Empleado.getText()));
			int n = pst.executeUpdate();
			if(n>0) {
				JOptionPane.showMessageDialog(rootPane, "Se Elimino de forma correcta!!!");
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		mostrar("");
		txtId_Empleado.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtCedula.setText("");
		txtCargo.setText("");
		txtSalario_Mensual.setText("");
		txtHoras_Trabajadas.setText("");
		txtHoras_Extras.setText("");
		txtDomingo.setText("");
		txtRata_por_Hora.setText("");
		txtSeguro.setText("");
		txtSeguro_Educativo.setText("");
		txtCalcular.setText("");
		txtSalario_.setText("");
		
	}
		protected void btnBuscarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
			mostrar(txtBuscar.getText());
		
	}
		protected void btnNuevoActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
			
			
			
			txtId_Empleado.setText("");
			txtNombre.setText("");
			txtApellido.setText("");
			txtCedula.setText("");
			txtCargo.setText("");
			txtSalario_Mensual.setText("");
			txtHoras_Trabajadas.setText("");
			txtHoras_Extras.setText("");
			txtDomingo.setText("");
			txtRata_por_Hora.setText("");
			txtSeguro.setText("");
			txtSeguro_Educativo.setText("");
			txtCalcular.setText("");
			txtSalario_.setText("");
	}
		protected void tblTablaMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
			int fila = tblTabla.rowAtPoint(evt.getPoint());
			txtId_Empleado.setText(tblTabla.getValueAt(fila, 0).toString());
			txtNombre.setText(tblTabla.getValueAt(fila, 1).toString());
			txtApellido.setText(tblTabla.getValueAt(fila, 2).toString());
			txtCedula.setText(tblTabla.getValueAt(fila, 3).toString());
			txtCargo.setText(tblTabla.getValueAt(fila, 4).toString());
			txtSalario_Mensual.setText(tblTabla.getValueAt(fila, 5).toString());
			txtSalario_.setText(tblTabla.getValueAt(fila, 6).toString());
			txtRata_por_Hora.setText(tblTabla.getValueAt(fila, 7).toString());
			txtHoras_Trabajadas.setText(tblTabla.getValueAt(fila, 8).toString());
			txtHoras_Extras.setText(tblTabla.getValueAt(fila, 9).toString());
			txtDomingo.setText(tblTabla.getValueAt(fila, 10).toString());
			txtCalcular.setText(tblTabla.getValueAt(fila, 11).toString());
			
	}
		protected void btnGuardarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
			
			try {
				Connection con = null;
				con = Access.obtenerConexion();
			if(txtId_Empleado.getText().equals("")) {
				String sql = "insert into Empleados (Nombre, Apellido, Cedula, Cargo, Salario_Mensual, Salario_Quincenal,Tarifa_por_Hora, Horas_Trabajadas, Horas_Extras, Horas_por_Domingo, Salario_Neto) values (?,?,?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, txtNombre.getText());
				pst.setString(2, txtApellido.getText());
				pst.setString(3, txtCedula.getText());
				pst.setString(4, txtCargo.getText());
				pst.setString(5, txtSalario_Mensual.getText());
				pst.setString(6, txtSalario_.getText());
				pst.setString(7, txtRata_por_Hora.getText());
				pst.setString(8, txtHoras_Trabajadas.getText());
				pst.setString(9, txtHoras_Extras.getText());
			    pst.setString(10, txtDomingo.getText());
			    pst.setString(11, txtCalcular.getText());
				int n = pst.executeUpdate(); 
				if(n>0) {
					JOptionPane.showMessageDialog(rootPane, "Se registro de forma correcta!!!");
				}
			}else {
				String sql = "update Empleados set Nombre = ?, Apellido = ?, Cedula = ?, Cargo = ?, Salario_Mensual = ?,Salario_Quincenal = ?, Tarifa_por_Hora = ?, Horas_Trabajadas = ?, Horas_Extras = ?, Horas_por_Domingo = ?, Salario_Neto = ? where Id_Empleado = ?";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, txtNombre.getText());
				pst.setString(2, txtApellido.getText());
				pst.setString(3, txtCedula.getText());
				pst.setString(4, txtCargo.getText());
				pst.setString(5, txtSalario_Mensual.getText());
				pst.setString(6, txtSalario_.getText());
				pst.setString(7, txtRata_por_Hora.getText());
				pst.setString(8, txtHoras_Trabajadas.getText());
				pst.setString(9, txtHoras_Extras.getText());
			    pst.setString(10, txtDomingo.getText());
			    pst.setString(11, txtCalcular.getText());
				pst.setInt(12, Integer.parseInt(txtId_Empleado.getText()));
				int n = pst.executeUpdate();
				if(n>0) {
					JOptionPane.showMessageDialog(rootPane, "SE ACTUALIZO DE FORMA CORRECTA!!!");
				}
			}}catch(Exception ex) {
				ex.printStackTrace();
			}
		mostrar("");
		txtId_Empleado.setText("");
		txtNombre.setText("");
		txtApellido.setText("");
		txtCedula.setText("");
		txtCargo.setText("");
		txtSalario_Mensual.setText("");
		txtHoras_Trabajadas.setText("");
		txtHoras_Extras.setText("");
		txtDomingo.setText("");
		txtRata_por_Hora.setText("");
		txtSeguro.setText("");
		txtSeguro_Educativo.setText("");
		txtCalcular.setText("");
		txtSalario_.setText("");
	}	
		public void mostrar(String Buscar) {
			
			try {
				Connection con = null;
				con = Access.obtenerConexion();
				DefaultTableModel miModelo = new DefaultTableModel (null,titulos);
				String dts [] = new String [13];
				String sql = "Select * from Empleados where Nombre like '"+Buscar+"%'";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					dts[0] = rs.getString(1);
					dts[1] = rs.getString(2);
					dts[2] = rs.getString(3);
					dts[3] = rs.getString(4);
					dts[4] = rs.getString(5);
					dts[5] = rs.getString(6);
					dts[6] = rs.getString(7);
					dts[7] = rs.getString(8);
					dts[8] = rs.getString(9);
					dts[9] = rs.getString(10);
					dts[10] = rs.getString(11);
					dts[11] = rs.getString(12);
					
					
					
				
					
					
					
					
					miModelo.addRow(dts);
				}
				tblTabla.setModel(miModelo);
			}catch(Exception ex) {
				ex.printStackTrace();
				
			}
			
		}
		public static void main(String []args) {
			
			EmpleadosporRegistrar mi = new EmpleadosporRegistrar();
			mi.setDefaultCloseOperation(EXIT_ON_CLOSE);
			mi.setLayout(null);
			mi.setTitle(" PLANILLA DE EMPLEADO DE LA UNIVERSIDAD INTERAMERICANA DE PANAMA  ");
			mi.setSize(1200,750);
			mi.setVisible(true);
			mi.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo UIP.png"));
	
				//Connection cn = Access.obtenerConexion();
		
	}
		public void Conectar() {
			// TODO Auto-generated method stub
			EmpleadosporRegistrar mi = new EmpleadosporRegistrar();
			mi.setDefaultCloseOperation(EXIT_ON_CLOSE);
			mi.setLayout(null);
			mi.setTitle(" PLANILLA DE EMPLEADO DE LA UNIVERSIDAD INTERAMERICANA DE PANAMA ");
			mi.setSize(950,700);
			mi.setVisible(true);
			mi.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Logo UIP.png"));
		}
}

