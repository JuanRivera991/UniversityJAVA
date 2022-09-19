package Calculadora;

/**
 *
 * @author JuanS
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        //ConvertidorView vista = new ConvertidorView();
        ConvertidorSwing vista = new ConvertidorSwing();
        ConvertidorController controlador = new ConvertidorController(modelo , vista);
        vista.setControlador(controlador);
        vista.arranca();
    }
    
}
