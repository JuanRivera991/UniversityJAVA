package Modelo;

/**
 *
 * @author JuanS
 */
public class ListaEnlazada {
    private NodoListaEnlazada inicioPersona;
    private NodoListaEnlazada inicioLibro;
    private int tamañoPersona, tamañoLibro;
    
    //Constructor por defecto
    public ListaEnlazada() {
        inicioPersona = null;
        inicioLibro = null;
        tamañoPersona = 0;
        tamañoLibro = 0;
    }
    //Consulta si la lista esta vacia.
    public boolean esVaciaPersona(){
        return inicioPersona==null;
    }
    
    public boolean esVaciaLibro(){
        return inicioLibro==null;
    }
    
    //Consulta cuantos nodos tiene la lista.
    public int getTamañoPersona(){
        return tamañoPersona;
    }
    
    public int getTamañoLibro(){
        return tamañoLibro;
    }
    
    //Agregar nodo al inicio de la lista
    public void addInicioListaPersona(Persona persona){
        NodoListaEnlazada nuevo = new NodoListaEnlazada();
        nuevo.setPersona(persona);
        
        if(esVaciaPersona()){
            inicioPersona = nuevo;
        }else{
            nuevo.setSiguientePersona(inicioPersona);
            inicioPersona = nuevo;
        }
        tamañoPersona++;
    }
    
    public void addInicioListaLibro(Libro libro){
        NodoListaEnlazada nuevo = new NodoListaEnlazada();
        nuevo.setLibro(libro);
        
        if(esVaciaLibro()){
            inicioLibro = nuevo;
        }else{
            nuevo.setSiguienteLibro(inicioLibro);
            inicioLibro = nuevo;
        }
        tamañoLibro++;
    }
    
    //Busqueda por posicion.
    public Persona getPersona(int posicion) throws Exception{
        if(posicion >= 0 && posicion < tamañoPersona){
            if(posicion == 0){
                return inicioPersona.getPersona();
            }else{
                NodoListaEnlazada aux = inicioPersona;
                for(int i = 0; i < posicion ; i++){
                    aux = aux.getSiguientePersona();
                }
                return aux.getPersona();
            }
        }else{
            throw new Exception("Posición inexistente en la lista");
        }
    }
    
    public Libro getLibro(int posicion) throws Exception{
        if(posicion >= 0 && posicion < tamañoLibro){
            if(posicion == 0){
                return inicioLibro.getLibro();
            }else{
                NodoListaEnlazada aux = inicioLibro;
                for(int i = 0;i < posicion; i++){
                    aux = aux.getSiguienteLibro();
                }
                return aux.getLibro();
            }
        }else{
            throw new Exception("Posicion inexsistente en la lista");
        }
    }
    
    //Buscar objeto segun su id
    
    public Persona buscarPersona(String id){
        NodoListaEnlazada aux = inicioPersona;
        boolean encontrado  = false;
        
        while(aux != null && encontrado != true){
            if(id.equals(aux.getPersona().getNumIdentificacion())){
                encontrado = true;
            }else{
                aux = aux.getSiguientePersona();
            }
        }
        
        return aux.getPersona();
    }
    
    public Libro buscarLibro(String ISBN){
        NodoListaEnlazada aux = inicioLibro;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if(ISBN.equals(aux.getLibro().getISBN())){
                encontrado = true;
            }else{
                aux = aux.getSiguienteLibro();
            }
        }
        return aux.getLibro();
    }
    
    public Libro buscarLibroPorTitulo(String titulo){
        NodoListaEnlazada aux = inicioLibro;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if(titulo.equals(aux.getLibro().getTitulo())){
                encontrado = true;
            }else{
                aux = aux.getSiguienteLibro();
            }
        }
        return aux.getLibro();
    }
    
    public boolean buscarLibroPorTituloBoolean(String titulo){
        NodoListaEnlazada aux = inicioLibro;
        boolean encontrado = false;
        
        while(aux != null && encontrado != true){
            if(titulo.equals(aux.getLibro().getTitulo())){
                encontrado = true;
            }else{
                aux = aux.getSiguienteLibro();
            }
        }
        return encontrado;
    }
    
    public boolean buscarPersonaBoolean(String id){
        NodoListaEnlazada aux = inicioPersona;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if(id.equals(aux.getPersona().getNumIdentificacion())){
                encontrado = true;
            }else{
                aux = aux.getSiguientePersona();
            }
        }
        
        return encontrado;
    }
    
    public boolean buscarLibroBoolean (String ISBN){
        NodoListaEnlazada aux = inicioLibro;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if(ISBN.equals(aux.getLibro().getISBN())){
                encontrado = true;
            }else{
                aux = aux.getSiguienteLibro();
            }
        }
        return encontrado;
    }
    
    //Remover objeto de las listas segun su id
    public String removerPersona(String id){
        String respuesta ="El usuario no existe";
        if(buscarPersonaBoolean(id)){
            if(id.equals(inicioPersona.getPersona().getNumIdentificacion())){
                inicioPersona = inicioPersona.getSiguientePersona();
            }else{
                NodoListaEnlazada aux = inicioPersona;
                
                while(!aux.getSiguientePersona().getPersona().getNumIdentificacion().equals(id)){
                    aux = aux.getSiguientePersona();
                }
                NodoListaEnlazada siguiente = aux.getSiguientePersona().getSiguientePersona();
                aux.setSiguientePersona(siguiente);
            }
            tamañoPersona--;
            respuesta = "El usuario ha sido eliminado del sistema.";
            return respuesta;
            
        }
        return respuesta;
    }
    
    public String removerLibro(String ISBN){
        String respuesta ="El libro no esta en registrado.";
        if(buscarLibroBoolean(ISBN)){
            if(ISBN.equals(inicioLibro.getLibro().getISBN())){
                inicioLibro = inicioLibro.getSiguienteLibro();
            }else{
                NodoListaEnlazada aux = inicioLibro;
                
                while(!ISBN.equals(aux.getSiguienteLibro().getLibro().getISBN())){
                    aux = aux.getSiguienteLibro();
                }
                NodoListaEnlazada siguiente = aux.getSiguienteLibro().getSiguienteLibro();
                aux.setSiguienteLibro(siguiente);
            }
            tamañoLibro--;
            respuesta = "El libro ha sido eliminado del sistema.";
            return respuesta;
            
        }
        return respuesta;
    }
    
    //Consultar posicion de un elemento en la lista
    public int getPosicionPersona(String id)throws Exception{
        if(buscarPersonaBoolean(id)){
            NodoListaEnlazada aux = inicioPersona;
            int cont = 0;
            
            while(!aux.getPersona().getNumIdentificacion().equals(id)){
                cont++;
                aux = aux.getSiguientePersona();
            }
            return cont;
        }else{
            throw new Exception("Numero de identificación inexistente en la lista.");   
        }
    }
    
    public int getPosicionLibro(String ISBN)throws Exception{
        if(buscarLibroBoolean(ISBN)){
            NodoListaEnlazada aux = inicioLibro;
            int cont = 0;
            
            while(!aux.getLibro().getISBN().equals(ISBN)){
                cont++;
                aux = aux.getSiguienteLibro();
            }
            return cont;
        }else{
            throw new Exception("ISBN inexistente en la lista");
        }
    }

    public String mostrarInfoLibros(int posicion) throws Exception{
        if(posicion >=0 && posicion < tamañoLibro){
            if(posicion == 0){
                return inicioLibro.getLibro().mostrarInfobasica();
            }else{
                NodoListaEnlazada aux = inicioLibro;
                for(int i = 0; i < posicion; i++){
                    aux = aux.getSiguienteLibro();
                }
                return aux.getLibro().mostrarInfobasica();
            }
        }else{
            throw new Exception("Posicion inexistente en la lista");
        }
        
    }
    
    public String mostrarInfoPersonas(int posicion)throws Exception{
        if(posicion >= 0 && posicion < tamañoPersona){
            if(posicion == 0){
                return inicioPersona.getPersona().mostrarInfoBasica();
            }else{
                NodoListaEnlazada aux = inicioPersona;
                for(int i = 0; i < posicion; i++){
                    aux = aux.getSiguientePersona();
                }
                return aux.getPersona().mostrarInfoBasica();
            }
        }else{
            throw new Exception("Posicion inexistente en la lista");
        }
    }
    
}
