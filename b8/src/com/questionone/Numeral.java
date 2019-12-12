package com.questionone;

public class Numeral extends Expression {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
        return Integer.toString(this.getValue());
    }

    public int evaluate() {
        return this.getValue();
    }
    
    public Numeral() {
    	
    }
    
    public Numeral(int _value) {
        this.value = _value;
    }
}
