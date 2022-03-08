package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;


import javax.swing.JOptionPane;
public class Access {
 
	static Connection con = null;
	static Connection con2 = null;
	static String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
	static String url = "jdbc:ucanaccess://C:\\Users\\Elizabeth\\Desktop\\Programacion 2\\Base de Datos\\Planilla.accdb";
	
	public static Connection obtenerConexion() {
	
		try {
			if(con == null) {
				Class.forName(driver);
				con = DriverManager.getConnection(url);
				JOptionPane.showMessageDialog(null, "Conexión Correcta");
				EmpleadosporRegistrar A = new EmpleadosporRegistrar();
				A.Conectar();
				
			}
			
		}catch(Exception ex) {
				ex.printStackTrace();
				con = null;
			}
			return con;
	}
}
