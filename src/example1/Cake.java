package example1;

import javax.swing.JOptionPane;

/**
 * This class is an an abstraction of a real cake object. It demonstrates poor
 * encapsulation.
 * 
 * @author jlombardo
 */
public class Cake {
    private String cakeName;
    private int quantity;
    private int size;

    //// Some of the methods below violate encapsulation rules. Many should
    //   be private, those that have arguments (setters) need validation rules.
    ////////

    public String getCakeName(){
        return cakeName;
    }
    public void setCakeName(String name) {
        if(cakeName == null || cakeName.length() < 0){
            System.out.println("Please enter a Cake Name");
        }
        this.cakeName = name;
    }
    
    
    private int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity){
        if (quantity < 0){
            System.out.println("Please enter a Quantity");
        }
        this.quantity = quantity;
    }
    
    /* 
        These methods represent steps that should be performed
        in a certain order, but there is no guarantee this will happen.
        Furthermore, making all of these methods public exposes complexity
        that is not necessary. 
    */

    // VERY BAD! quantity should be validated for legal range
    public void make(int quantity){
    this.setQuantity(quantity);
    this.gatherIngredients();
    this.mixIngredients();
    this.bake();
    this.takeFromOvenAndLetCool();
    
}
    private void gatherIngredients() {
        System.out.println("Ingredients gathered");
    }

    private void mixIngredients() {
        System.out.println("Ingredients mixed");
    }

    private void bake() {
        System.out.println("Baking...");
    }

    private void takeFromOvenAndLetCool() {
        System.out.println("All done baking, removed from oven, cooling...");
    }
}
