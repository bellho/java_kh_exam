package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	
	//Field
	private Shape s = new Shape();
	
	//Constructor
	
	//Method
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return s.getHeight()*2+s.getWidth()*2;		
	}
	
	public double calcArae(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return s.getHeight() * s.getWidth();
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "사각형" + s.information();
	}
}
