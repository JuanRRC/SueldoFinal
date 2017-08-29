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
public class Vendedor extends Empleado implements SueldoBaseInterface {

    public Vendedor(double cedula, String nombre, String apellido, String email,String tipoE, double sueldoBase) {
        super(cedula, nombre, apellido, email,tipoE,sueldoBase);
    }
    
    private int porcenComicion;
    private double totalVentas;
    private double SueldoTotal;

    public float getPorcenComicion() {
        return porcenComicion;
    }

    public void setPorcenComicion(int porcenComicion) {
        this.porcenComicion = porcenComicion;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }


    
    @Override
    public double SueldoBase(int porcenComicion,int totalVentas) {
        SueldoTotal=this.getSueldoBase()+(porcenComicion*totalVentas/100);
        return SueldoTotal;
        
    }

    public void imprimir(){
        System.out.println("-------------- Resultados ------------------------");
        System.out.println("Cedula            : "+this.getCedula());
        System.out.println("Nombre            : "+this.getNombre());
        System.out.println("Apellido          : "+this.getApellido());
        System.out.println("Email             : "+this.getEmail());
        System.out.println("Tipo de Empleado  : "+this.getTipoE());
        System.out.println("Sueldo Final      : "+SueldoTotal);
        System.out.println("-------------------------------------------------------");
    }
    
}
