package com.renova.adaptor;


public class UIerror implements UserError {

    private int errorCode;
    private String description;


    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDescription() {
        return this.description;
    }


    public void sendEmail() {
        System.out.println("Kullanıcı hatası alındı "+ errorCode + " "+ description);
    }

    public UIerror(int errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }
}
