/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package takeout;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jahin
 */
public class Burger {
    
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
           cost += item.price();
        }		
        return cost;
    }
    
    public void showItems(){
        //System.out.println("Bunger has:");
        for (Item item : items) {
            System.out.println(item.name());
        }	
    }
}
