package com.calculator.model;

public class ResponseSimple {

    private float firstNumber;
    private float secondNumber;
    private float result;
    private String operation;
    private String expression;

    public ResponseSimple() {}

    public ResponseSimple(String expression) {
        this.expression = expression;
    }

    public ResponseSimple (float num1, float num2, float result, String op){
        this.firstNumber = num1;
        this.secondNumber = num2;
        this.result = result;
        this.operation = op;
    }

    public float getNum1() {
        return firstNumber;
    }

    public void setNum1(float num1) {
        this.firstNumber = num1;
    }

    public float getNum2() {
        return secondNumber;
    }

    public void setNum2(float num2) {
        this.secondNumber = num2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setExpression(String expression){
        this.expression = expression;
    }

    public String getExpression(){
        return expression;
    }
}
