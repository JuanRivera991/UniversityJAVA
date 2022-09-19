package Controlador;

import Modelo.Clientes;
import Modelo.Libro;
import Modelo.ListaEnlazada;
import java.util.Date;

/**
 *
 * @author JuanS
 */
public class Controlador {
    private ListaEnlazada guardarClientes = new ListaEnlazada();
    private ListaEnlazada guardarEmpleados = new ListaEnlazada();
    private ListaEnlazada guardarLibrosFisicos = new ListaEnlazada();
    private ListaEnlazada guardarLibrosElectronicos = new ListaEnlazada();
    private ListaEnlazada guardarTodosLibros = new ListaEnlazada();
    
    public Controlador(){}

    public ListaEnlazada getGuardarClientes() {
        return guardarClientes;
    }

    public ListaEnlazada getGuardarEmpleados() {
        return guardarEmpleados;
    }

    public ListaEnlazada getGuardarLibrosElectronicos() {
        return guardarLibrosElectronicos;
    }

    public ListaEnlazada getGuardarLibrosFisicos() {
        return guardarLibrosFisicos;
    }

    public ListaEnlazada getGuardarTodosLibros() {
        return guardarTodosLibros;
    }

    public void setGuardarClientes(ListaEnlazada guardarClientes) {
        this.guardarClientes = guardarClientes;
    }

    public void setGuardarEmpleados(ListaEnlazada guardarEmpleados) {
        this.guardarEmpleados = guardarEmpleados;
    }

    public void setGuardarLibrosElectronicos(ListaEnlazada guardarLibrosElectronicos) {
        this.guardarLibrosElectronicos = guardarLibrosElectronicos;
    }

    public void setGuardarLibrosFisicos(ListaEnlazada guardarLibrosFisicos) {
        this.guardarLibrosFisicos = guardarLibrosFisicos;
    }

    public void setGuardarTodosLibros(ListaEnlazada guardarTodosLibros) {
        this.guardarTodosLibros = guardarTodosLibros;
    }
    
    public String[] referenciasSeparadas(String id) throws Exception{
        Clientes cliente = (Clientes) guardarClientes.buscarPersona(id);
        int tamañoListaLibros = cliente.getListaLibros().getTamañoLibro();
        String referencias = "";
        for(int i = 0; i<tamañoListaLibros; i++){
            Libro libro = cliente.getListaLibros().getLibro(i);
            referencias = referencias + buscarReferencias(libro.getTitulo());
        }
        String [] referenciasSeparadas = referencias.split(",");
        return referenciasSeparadas;
    }
    
    public String buscarReferencias(String titulo){
        
        Libro libro = guardarTodosLibros.buscarLibroPorTitulo(titulo);
        String [] referencias = libro.getReferencias().split(",");
        String referencias2 = libro.getReferencias() + ",";
        
        for(int i = 0; i<referencias.length ; i++){
            if(this.guardarTodosLibros.buscarLibroPorTituloBoolean(referencias[i]) == true){
                Libro aux = this.guardarTodosLibros.buscarLibroPorTitulo(referencias[i]);
                referencias2 = referencias2 + aux.getReferencias() + ",";
            }
        }
        return referencias2;
    }
    
    public String referenciasString(String[] referencias){
        String referencias2 = "";
        for(int i = 0; i<referencias.length ; i++){
            referencias2 = referencias2 + referencias[i] + "\n";
        }
        
        return referencias2;
    }
    public String pasarDateAString(Date fecha){
        long d = fecha.getTime();
        java.sql.Date d2 = new java.sql.Date(d);
        String fechaFinal = d2.toString();
        return fechaFinal;
    }
    
    public String recorrerListaLibros(ListaEnlazada listaLibros) throws Exception{
        String informacion = "";
        for(int i = 0; i < listaLibros.getTamañoLibro(); i++){
            informacion = informacion + listaLibros.getLibro(i).mostrarInfobasica() + "\n";
        }
        return informacion;
    }
    
    public String recorrerListaLibros2(ListaEnlazada listaLibros) throws Exception{
        String informacion = "";
        for(int i = 0; i < listaLibros.getTamañoLibro(); i++){
            informacion = informacion + listaLibros.getLibro(i).toString() + "\n";
        }
        return informacion;
    }
    
    public String recorrerListaLibrosClientes(ListaEnlazada listaLibros) throws Exception{
        String informacion = "";
        for(int i = 0; i < listaLibros.getTamañoLibro(); i++){
            informacion = informacion + listaLibros.getLibro(i).mostrarInfoClientes()+ "\n";
        }
        return informacion;
    }
    public String recorrerListaLibrosClientes2(ListaEnlazada listaLibros) throws Exception{
        for(int i = 0; i < listaLibros.getTamañoLibro(); i++){
            String ISBN = listaLibros.getLibro(i).getISBN();
            if(this.guardarLibrosFisicos.buscarLibroBoolean(ISBN) == true){
                int cantidadEjemplares = this.guardarLibrosFisicos.buscarLibro(ISBN).getCantidadEjemplares();
                int cantidadPrestados = this.guardarLibrosFisicos.buscarLibro(ISBN).getCantidadPrestados();
                
                this.guardarLibrosFisicos.buscarLibro(ISBN).setCantidadEjemplares(cantidadEjemplares + 1);
                this.guardarLibrosFisicos.buscarLibro(ISBN).setCantidadPrestados(cantidadPrestados - 1);
                this.guardarTodosLibros.buscarLibro(ISBN).setCantidadEjemplares(cantidadEjemplares + 1);
                this.guardarTodosLibros.buscarLibro(ISBN).setCantidadPrestados(cantidadPrestados - 1);
            }
        }
        
        String respuesta = "El cliente ha sido eliminado del sistema";
        return respuesta;
    }
    
    public String recorrerListaPersonas(ListaEnlazada listaPersonas) throws Exception{
        String informacion = "";
        for(int i = 0; i< listaPersonas.getTamañoPersona(); i++){
            informacion = informacion + listaPersonas.getPersona(i).mostrarInfoBasica() + "\n";
        }
        return informacion;
    }
}
