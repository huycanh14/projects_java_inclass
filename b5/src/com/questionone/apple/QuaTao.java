package com.questionone.apple;

import com.questionone.Fruit;

public class QuaTao extends Fruit {
	
	private final String nameFruit = "Quả táo";

	public QuaTao() {
		super.setEatable(true);
		super.setAverageWeight(0.6);
		super.setPrice(18.0);
		super.setShape("hình tròn");
	}

	public String getNameFruit() {
		return nameFruit;
	}
	
}
