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
public class MealBuilder {
       private ColdDrink coldDrink;
   private HotDrink hotDrink;
   private Decorator decorate;
    private Object decorator;
   public void prepareDietDrink() {
      coldDrink = new DietDrink() {};
   }

   public void prepareTea() {
      hotDrink = new Tea() {};
   }

   public void addDecorator(Decorator decorate) {
      this.decorate= decorate;
   }

   public double getCost() {
      double cost = 0;

      if (coldDrink != null) {
         cost += coldDrink.price();
      }

      if (hotDrink != null) {
         cost += hotDrink.price();
      }

      if (decorator != null) {
         cost += decorator.price();
      }

      return cost;
   }
     public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
