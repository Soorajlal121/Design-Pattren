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
 import java.util.ArrayList;
import java.util.List;
public class Meal {
   private final List<Item> items = new ArrayList<>();	
   public void addItem(Item item){
      items.add(item);
   }
   public float getCost(){
      float cost = 0.0f;  
      cost = items.stream().map((item) -> item.price()).reduce(cost, (accumulator, _item) -> accumulator + _item);		
      return cost;
   }
   public void showItems(){
       items.stream().map((item) -> {
           System.out.print("Item : " + item.name());
           return item;
       }).map((item) -> {
           System.out.print(", Packing : " + item.packing().pack());		
           return item;
       }).forEachOrdered((item) -> {
           System.out.println(", Price : " + item.price());
       });
   }	
}