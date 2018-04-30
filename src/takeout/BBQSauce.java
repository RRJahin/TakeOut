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
public class BBQSauce implements Item{
    
    @Override
    public String name(){
        return "BBQ Sauce";
    }
    
    @Override
    public float price(){
        return 20.0f;
    }
}
