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
public abstract class ColdDrink implements Item {

	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}