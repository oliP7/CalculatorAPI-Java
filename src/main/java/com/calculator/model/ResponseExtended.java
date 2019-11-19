package com.calculator.model;

public class ResponseExtended {

    private int number;
    private String message;

    public ResponseExtended() {
    }

    public ResponseExtended(int number, String message){
        this.number = number;
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
