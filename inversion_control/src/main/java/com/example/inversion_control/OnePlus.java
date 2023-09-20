package com.example.inversion_control;

public class OnePlus implements Mobiles {
	
	OnePlus(){
		System.out.println("OnePlus Constructor triggered");
	}

	@Override
	public void getModelAndColor() {
		System.out.println("Model :10pro");
	}

}
