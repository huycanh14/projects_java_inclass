package com.questionone.orange;

public class CamSanh extends QuaCam{
	private final String origin = "Hà Giang";
	
	public CamSanh() {
		super.setAverageWeight(1.5);
        super.setPrice(24.0);
	}
	public String getOrigin() {
		return origin;
	}
}
