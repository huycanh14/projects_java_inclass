package com.questionone;

public class Fruit {
	private Boolean eatable; // có thể ăn được

    private double averageWeight; //cân nặng trung bình mỗi quả

    private String shape; // hình dáng

    private double price; // giá tiền

	public Boolean getEatable() {
		return eatable;
	}

	public void setEatable(Boolean eatable) {
		this.eatable = eatable;
	}

	public double getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
