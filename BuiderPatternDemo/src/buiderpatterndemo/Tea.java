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
public abstract class Tea extends HotDrink {
   @Override
   double price() {
      return 1.5; // Set the price for Tea
   }
      @Override
   String name() {
      return "Tea";
   }

}