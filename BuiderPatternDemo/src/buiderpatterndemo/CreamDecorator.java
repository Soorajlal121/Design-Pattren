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
public abstract class CreamDecorator implements Decorator  {
   public double decorate() {
      return 0.8; // Price for cream 
   }  
    @Override
    public Double decorator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
