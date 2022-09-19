/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Estudiante estudiante1 = new Estudiante();
         Estudiante estudiante2 = new Estudiante("123456","Pepo","Pog","pepo.pog@utp.edu.co");
         
         estudiante1.setNombre("Pepo");
         estudiante1.setApellido("Pig");
         
         estudiante2.setApellido("Paps");
         estudiante2.setEsBecado(true);
         
         Estudiante est3 = new Estudiante(estudiante2);
         
         //System.out.println("El estudiante " + estudiante2.getNombre() + " " + estudiante2.getApellido()  + " es becado: " + estudiante2.getEsBecado());
         est3.Imprimir();
         
         programaAcademico progAcademico = new programaAcademico();
         progAcademico.setId("123");
         progAcademico.setNombre("TecnologiaSW");
         progAcademico.setCosto(2000000);
         progAcademico.setNumSemestre(6);
         progAcademico.setCreditos(20);
         
         estudiante2.agregarProgramaAcademico(progAcademico);
         System.out.println(estudiante2.toString());
    }
    
}
