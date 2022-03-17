/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_3;

public class Computer {
    private String brand;
private double price;
private String system;

    public Computer(String brand, double price, String system) {
        this.brand = brand;
        this.price = price;
        this.system = system;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getSystem() {
        return system;
    }

public String showData(){
return "M arca: "+brand+" Precio: "+price+" Sistema: "+system;
}
}
