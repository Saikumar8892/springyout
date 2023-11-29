package com.example.inversion_control;

public class OnePlus implements Mobiles {
	
	Color color;
	OnePlus(){
		System.out.println("OnePlus Constructor triggered");
	}
	OnePlus(Color colorObj){
	 this.color = colorObj;
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model :10pro");
		color.getOnePlusColor();
	}

}
