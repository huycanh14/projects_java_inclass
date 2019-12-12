package com.questionone.orange;

public class CamCaoPhong extends QuaCam {
	private final String origin = "Cao Phong";
	public String getOrigin() {
		return origin;
	}
	public CamCaoPhong() {
		super.setAverageWeight(2.5);
        super.setPrice(29.0);
	}
}
