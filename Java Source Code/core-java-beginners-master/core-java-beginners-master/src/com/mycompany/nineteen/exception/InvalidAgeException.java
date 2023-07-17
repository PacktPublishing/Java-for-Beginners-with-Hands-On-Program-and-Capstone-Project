package com.mycompany.nineteen.exception;

public class InvalidAgeException extends Exception {

    private String errorCode;

    public InvalidAgeException(String msg){
        super(msg);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
