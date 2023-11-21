/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypatterndemo;

/**
 *
 * @author FA20-BSE-004
 */
public class Square implements Shape{

    Square() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
    
}
}
