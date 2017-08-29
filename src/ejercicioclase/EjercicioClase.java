/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Clint
 */

public class EjercicioClase {

    /**
     * @param args the command line arguments
     */

    public EjercicioClase(){
    
    Scanner t = new Scanner(System.in);
    
       Administrativo AD1 = new Administrativo(107418,"jose","perez","jose@gmail.com","Administrativo",700000);
       Administrativo AD2 = new Administrativo(126551,"pedro","rodriguez","pedro@gmail.com","Admnistrativo",700000);
       Vendedor VN1 = new Vendedor(158432,"juan","vallejo","juane@gmail.com","Vendedor",600000);
       Vendedor VN2 = new Vendedor(201592,"andres","reyes","andi@gmail.com","Vendedor",650000);
       
       
       OUTER:
        while (true) {
        
        System.out.println("-------------------------Menu------------------------------------------------------------------------------------------");
        System.out.println("Numero     |    Cedula  |    Nombre    |    Apellido  |   Email           |       Tipo Empleado |         Sueldo       ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("1°             "+AD1.getCedula()+"      "+AD1.getNombre()+"           "+AD1.getApellido()+"        "+AD1.getEmail()+"         "+AD1.getTipoE()+"            "+AD1.getSueldoBase());
        System.out.println("2°             "+AD2.getCedula()+"     "+AD2.getNombre()+"           "+AD1.getApellido()+"        "+AD1.getEmail()+"         "+AD1.getTipoE()+"            "+AD1.getSueldoBase());
        System.out.println("3°             "+VN1.getCedula()+"      "+VN1.getNombre()+"          "+VN1.getApellido()+"       "+VN1.getEmail()+"            "+VN1.getTipoE()+"              "+VN1.getSueldoBase());
        System.out.println("4°             "+VN2.getCedula()+"    "+VN2.getNombre()+"           "+VN2.getApellido()+"        "+VN2.getEmail()+"             "+VN2.getTipoE()+"              "+VN2.getSueldoBase());
        System.out.println("5. Salir");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Digite el numero del empleado para calcular su sueldo final : ");   
        byte opcion =  t.nextByte();
            switch (opcion) {
                case 1:
                    System.out.print("Digite las horas extra del empleado : ");
                    int he = t.nextInt();
                    System.out.print("Digite las horas del mes del empleado : ");
                    int hm = t.nextInt();
                    AD1.SueldoBase(he, hm);
                    AD1.imprimir();
                    break;
                
                case 2:
                    System.out.print("Digite las horas extra del empleado : ");
                    int he1 = t.nextInt();
                    System.out.print("Digite las horas del mes del empleado : ");
                    int hm1 = t.nextInt();
                    AD2.SueldoBase(he1, hm1);
                    AD2.imprimir();
                    break;
                    
                case 3:
                    System.out.print("Digite el porcentaje de comision del empleado( 0% - 100% ) : ");
                    int he2 = t.nextInt();
                    System.out.print("Digite el total de ventas del empleado : ");
                    int hm2 = t.nextInt();
                    VN1.SueldoBase(he2, hm2);
                    VN1.imprimir();
                    break;
                    
                case 4:
                    System.out.print("Digite el porcentaje de comision del empleado( 0% - 100% ) : ");
                    int he3 = t.nextInt();
                    System.out.print("Digite el total de ventas del empleado : ");
                    int hm3 = t.nextInt();
                    VN2.SueldoBase(he3, hm3);
                    VN2.imprimir();
                    break;
                         
                case 5:
                    
                    break OUTER;
                default:
                    System.out.println("-----------------------------------------");
                    System.out.println("|            Numero no valido            |");
                    System.out.println("-----------------------------------------");
                    break;
            }
        
        
    }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       EjercicioClase principal = new EjercicioClase(); 
       
        
    }
    
}
