package proyectobiblioteca;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionBD3 {
    private String usuario = "root";
    private String clave = "";
    private String url = "jdbc:mysql://localhost:3306/biblioteca";
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    
    public ConexionBD3(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,usuario,clave);
            //JOptionPane.showMessageDialog(null, "Hubo una conexión" + "\n");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConexionBD3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No hubo una conexión con la base de datos" + "\n" + ex.getMessage());
        }
    }
    
    public void registroClientes(String id, String nombre, String apellidos, String tipoId, int edad,
            String contraseña, String direccion){
        
        try {
            stmt = con.createStatement();
            String sentenciaSQL = "INSERT INTO clientes VALUES ("+ id + ",'" + nombre + "','" + apellidos 
                    + "','" + tipoId + "',"+ edad +", '"+ contraseña +"','" + direccion+ "')";
            
            stmt.executeUpdate(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "Cliente registrado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se creó el cliente" + "\t" + ex.getMessage());
        } 
    }
    
    public void editarClientes(String idCliente, String nombre, String apellidos, String tipoId, 
            int edad, String contraseña, String direccion){
        try {
            stmt = con.createStatement();
            String sentenciaSQL = "UPDATE clientes SET nombre = '" +nombre + "', apellidos = '" 
                    + apellidos + "', tipoId = '"+ tipoId + "', edad = " + edad + ", contraseña = '" 
                    + contraseña + "', direccion = '" + direccion + "' WHERE idCliente = '" + idCliente + "'" ;
            
            stmt.executeUpdate(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "Información editada con éxito");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se actulizó la información" + "\t" + ex.getMessage());
        } 
    }
    
    public ArrayList<Cliente> cargarClientes( ArrayList<Cliente> clientes ){
         try {
            this.stmt = this.con.createStatement();
            this.rs = this.stmt.executeQuery("SELECT * FROM clientes");
            this.rs.next();
            
            if(this.rs.isFirst() == false){
                System.out.println("No hay clientes en la base de datos");
            }else{
                while(this.rs.isAfterLast() == false){

                    Cliente cliente = new Cliente(this.rs.getString("idCliente"), this.rs.getString("nombre"),
                            this.rs.getString("apellidos"),this.rs.getString("tipoId"), this.rs.getInt("edad"),
                            this.rs.getString("contraseña"), this.rs.getString("direccion"));

                    clientes.add(cliente);
                    this.rs.next();
                }
            }
            this.rs.close();
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
         return clientes;
    }
    
    public void eliminarCliente(String numId){
        try {
            stmt = con.createStatement();
            String sentenciaSQL1 = "DELETE FROM prestamo WHERE idCliente = "+ numId;
            String sentenciaSQL2 = "DELETE FROM clientes WHERE idCliente = "+ numId;
            
            stmt.executeUpdate(sentenciaSQL1);
            stmt.executeUpdate(sentenciaSQL2);
            
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "El cliente ha no sido eliminado");
        }
        
    }
    
    public void pedirLibroPrestado(String idCliente, String ISBN){
        try {
            stmt = con.createStatement();
            String sentenciaSQL = "INSERT INTO `prestamo` (`idRelacion`, `ISBN`, `idCliente`) VALUES (null,'" +
                    ISBN+ "','" + idCliente + "')";
            
            stmt.executeUpdate(sentenciaSQL);
            JOptionPane.showMessageDialog(null, "El libro ha sido prestado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se presto el libro" + "\n" + ex.getMessage());
        } 
    }
    
    public String contraseñaString(char[] contraseñaChar){
        String contraseña =  Arrays.toString(contraseñaChar).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
        return contraseña;
    }
    
    
}
