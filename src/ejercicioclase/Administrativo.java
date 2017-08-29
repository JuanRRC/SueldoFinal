/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

/**
 *
 * @author Clint
 */
public class Administrativo extends Empleado implements SueldoBaseInterface {
    
    
    
    public Administrativo(double cedula, String nombre, String apellido, String email,String tipoE,double sueldoBase) {
        super(cedula, nombre, apellido, email,tipoE,sueldoBase);
    }
   
    private int hrextra;
    private int hrmes;
    private double sueldoT;

/*
    public double Sueldofinal(int hrextra,int hrmes){
        
        sueldoT = this.getSueldoBase()*((hrextra*1.5)+hrmes)/hrmes;
        
        return sueldoT;
    }
 */   
    @Override
    public double SueldoBase(int hrextra,int hrmes){
        sueldoT = this.getSueldoBase()*((hrextra*AUMENTO)+hrmes)/hrmes;
        
        return sueldoT;
    }
    
    
    
    
    
    public void imprimir(){
        System.out.println("-------------- Resultados ------------------------");
        System.out.println("Cedula            : "+this.getCedula());
        System.out.println("Nombre            : "+this.getNombre());
        System.out.println("Apellido          : "+this.getApellido());
        System.out.println("Email             : "+this.getEmail());
        System.out.println("Tipo de Empleado  : "+this.getTipoE());
        System.out.println("Sueldo Final      : "+sueldoT);
        System.out.println("-------------------------------------------------------");
    }
    
    
    
}
