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
public class WaiterComeChef {
    
    public Burger PrepareBeefBurger(){
        Burger burger = new Burger();
        burger.addItem(new BeefPaty());
        burger.addItem(new Cheese());
        burger.addItem(new BBQSauce());
        return burger;
    }
    
    public Burger PrepareChickenBurger(){
        Burger burger = new Burger();
        burger.addItem(new ChickenPatty());
        burger.addItem(new Cheese());
        burger.addItem(new ChilliSauce());
        return burger;
    }
}
