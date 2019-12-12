package com.questionone;

public class Division extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Division (Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }

    public Expression left() {
        return this.left;
    }

    public Expression right() {
        return this.right;
    }

    public String toString() {
        return "(" + this.left().toString() + "/" + this.right().toString() + ")";
    }

    public int evaluate() throws ArithmeticException {
        return this.left().evaluate() / this.right().evaluate();
    }
}