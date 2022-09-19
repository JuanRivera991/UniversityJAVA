package Modelo;

/**
 *
 * @author JuanS
 */
public class Clientes extends Persona {
    //Atributos
    protected String direccionCorrespondencia;
    
    //Constructores
    public Clientes() {}

    public Clientes(String direccionCorrespondencia, String nombre, String tipoIdentificacion,
            String numIdentificacion, String direccionResidencia, String telefono,
            String numCelular, String cargo, String fechaNacimiento) {
        super(nombre, tipoIdentificacion, numIdentificacion, direccionResidencia, telefono,
                numCelular, cargo, fechaNacimiento);
        this.direccionCorrespondencia = direccionCorrespondencia;
    }

    //Metodos get, set y toString
    public String getDireccionCorrespondencia() {
        return direccionCorrespondencia;
    }
    
    public void setDireccionCorrespondencia(String direccionCorrespondencia) {
        this.direccionCorrespondencia = direccionCorrespondencia;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " |Tipo de identificacion: " + this.tipoIdentificacion +
                " |Numero de identificacion: " + this.numIdentificacion + " |Direccion de residencia: " +
                this.direccionResidencia + " |Direccion de correspondencia: "+ this.direccionCorrespondencia +
                " |Telefono: " + this.telefono + " |Celular: " + this.numCelular + " |Cargo: " + this.cargo +
                " |Fecha de nacimiento: " + this.fechaNacimiento;
    }
    
    @Override
    public String mostrarInfoBasica(){
        return "Nombre: " + this.nombre + " |Numero de identificacion: " + this.numIdentificacion +
                " |Libros prestados: " + this.listaLibros.getTamañoLibro();
    }
}
