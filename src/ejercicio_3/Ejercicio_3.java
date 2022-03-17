/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

/**
 *
 * @author HP
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computer computadora = new Computer("HP", 3000.00,"Windows");
        System.out.println(computadora.showData());

        Laptop laptop = new Laptop("Apple",4000.00,"apple");
        laptop.setWeight(14.5);
        System.out.println(laptop.showData());

SmartPhone telefono = new SmartPhone(5.5, "samsung",2500, "Android");
telefono.showDataa();
    } 
   
}
