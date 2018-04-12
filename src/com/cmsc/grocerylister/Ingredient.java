/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
package com.cmsc.grocerylister;

public class Ingredient {
	
	private String name;
	private Integer quantity;
	private String units;
	
	public Ingredient(String yaml) {
		// TODO
	}
	
	public Ingredient(String name, Integer quantity, String units) {
		this.name = name;
		this.quantity = quantity;
		this.units = units;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public String getUnits() {
		return units;
	}
	
	@Override
	public String toString() {
		return null;
	}
}