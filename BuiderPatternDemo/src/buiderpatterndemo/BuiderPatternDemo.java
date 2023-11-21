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
public class BuiderPatternDemo {
     public static void main(String[] args) {
      MealBuilder mealBuilder = new MealBuilder();
      Meal vegMeal = mealBuilder.prepareVegMeal();
      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.println("Total Cost: " + vegMeal.getCost());
      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
      System.out.println("\n\nNon-Veg Meal");
      nonVegMeal.showItems();
      System.out.println("Total Cost: " + nonVegMeal.getCost());
            // For DietDrink
      mealBuilder.prepareDietDrink();
      System.out.println("Cost of Diet Drink: $" + mealBuilder.getCost());
      // For Tea with Sweetener and Cream
      mealBuilder.prepareTea();
      mealBuilder.addDecorator(new SweetenerDecorator());
      System.out.println("Cost of Tea with Sweetener and Cream $" + mealBuilder.getCost());

   }}
