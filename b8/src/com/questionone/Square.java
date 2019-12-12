package com.questionone;

public class Square extends Expression {
	private Expression expression;

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	
	public String toString() {
        return "(" + this.expression.toString() + "^2)";
    }

    public int evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }
    
    public Square(Expression exp) {
    	this.expression = exp;
    }
}
