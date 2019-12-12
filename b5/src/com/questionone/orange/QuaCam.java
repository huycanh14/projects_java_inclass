package com.questionone.orange;

import com.questionone.Fruit;

public class QuaCam extends Fruit {
	private final String name = "Quả Cam";
	
	public QuaCam() {
		super.setAverageWeight(1.2);
        super.setEatable(true);
        super.setPrice(12.0);
        super.setShape("Hình oval");
	}

	public String getName() {
		return name;
	}
	
}
