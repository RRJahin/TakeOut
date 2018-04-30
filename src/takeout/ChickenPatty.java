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
public class ChickenPatty implements Item{
    
    @Override
    public String name(){
        return "Chicken Patty";
    }
    
    @Override
    public float price(){
        return 70.0f;
    }
}
