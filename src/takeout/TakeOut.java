/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

/**
 *
 * @author Jahin
 */
public class TakeOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WaiterComeChef waiter = new WaiterComeChef();
        
        System.out.println("Beef Burger:");
        Burger beefBurger = waiter.PrepareBeefBurger();
        beefBurger.showItems();
        System.out.println("Price : " + beefBurger.getCost() + "\n");
        
        System.out.println("Chicken Burger: ");
        Burger chickenBurger = waiter.PrepareChickenBurger();
        chickenBurger.showItems();
        System.out.print("Price : " + chickenBurger.getCost() + "\n");
     
    }
    
}
