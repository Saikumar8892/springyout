package com.example.inversion_control;

public class Iphone implements Mobiles {

	Color color;
	Iphone(Color colorObj){
		 this.color = colorObj;
		}
	@Override
	public void getModelAndColor() {
		System.out.println("Model :14pro");
		color.getIphoneColor();
	}

}
