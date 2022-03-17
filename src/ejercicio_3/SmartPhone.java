/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author HP
 */
public class SmartPhone extends Computer{
    private double length;

    public SmartPhone(double length, String brand, double price, String system) {
        super(brand, price, system);
        this.length = length;
    }

public void showDataa(){
    System.out.println("Longitud: "+length+super.showData());
}
}
