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
public class AbstractFactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);            
      Shape shape1 = shapeFactory.getShape("RECTANGLE");      
      shape1.draw();          
      Shape shape2 = shapeFactory.getShape("SQUARE");    
      shape2.draw();    
      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);      
      Shape shape3 = shapeFactory1.getShape("RECTANGLE");     
      shape3.draw();     
      Shape shape4 = shapeFactory1.getShape("SQUARE");
      shape4.draw();
    }
    
}
