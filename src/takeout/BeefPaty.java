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
public class BeefPaty implements Item{
    
    @Override
    public String name(){
        return "Beef Patty";
    }
    
    @Override
    public float price(){
        return 80.0f;
    }
}
