package com.renova.adaptor;

public class DBerror implements Error{

   private int errorCode;
   private String description;


    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public String getErrorDescription() {
        return this.description;
    }

    @Override
    public void sendEmail() {
        System.out.println("DB hatası alındı "+ errorCode + " "+ description);
    }

    public DBerror(int errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }
}
