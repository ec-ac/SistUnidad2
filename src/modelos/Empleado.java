/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author labc205
 */
class Empleado {
    private String Nombre, cargo;
    private int Salary;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalary() {
        return Salary;
    }

    public Empleado(String Nombre, String cargo, int Salary) {
        this.Nombre = Nombre;
        this.cargo = cargo;
        this.Salary = Salary;
    }
    
    
    
    
}
