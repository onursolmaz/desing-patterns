package com.renova.adaptor;

public interface Error {

    public int getErrorCode();
    public String getErrorDescription();
    public void sendEmail();

}
