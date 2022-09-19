package Modelo;

/**
 *
 * @author JuanS
 */
public class Empleados extends Persona {
    //Atributos
    protected String fechaIngreso;

    //Constructores
    public Empleados() {
    }

    public Empleados(String fechaIngreso, String nombre, String tipoIdentificacion,
            String numIdentificacion, String direccionResidencia, String telefono,
            String numCelular, String cargo, String fechaNacimiento) {
        super(nombre, tipoIdentificacion, numIdentificacion, direccionResidencia
                , telefono, numCelular, cargo, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }
    
    //Metodos get, set y toString
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "| Tipo de identificacion: " + this.tipoIdentificacion +
                "| Numero de identificacion: " + this.numIdentificacion + "| Direccion de residencia: " +
                this.direccionResidencia + "| Telefono: " + this.telefono + "| Celular: " + 
                this.numCelular + "| Cargo: " + this.cargo + "| Fecha de nacimiento: " + this.fechaNacimiento +
                "| Fecha de ingreso a la biblioteca: " + this.fechaIngreso;
    }
}
