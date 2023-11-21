/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buiderpatterndemo;

/**
 *
 * @author FA20-BSE-004
 */
public abstract class DietDrink extends ColdDrink {

    /**
     *
     * @return
     */
    @Override
   public float price() {
      return (float) 2.5; // Set the price for DietDrink
   }

   @Override
   public String name() {
      return "Diet Drink";
   }

    void addItem(ChickenBurger chickenBurger) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
