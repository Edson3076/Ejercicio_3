/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author HP
 */
public class Laptop extends Computer{
    private double weight;

    public Laptop(String brand, double price, String system) {
        super(brand, price, system);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

public String showData(){
return "Peso "+weight+" Marca: "+super.getBrand()+" Precio: "+super.getPrice()+" Sistema: "+super.getSystem();
}
}
