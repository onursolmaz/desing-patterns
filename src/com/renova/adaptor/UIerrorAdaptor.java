package com.renova.adaptor;

public class UIerrorAdaptor implements Error{

    private UIerror uIerror;


    public UIerrorAdaptor(UIerror uIerror){
        this.uIerror=uIerror;
    }

    @Override
    public int getErrorCode() {
        return uIerror.getErrorCode();
    }

    @Override
    public String getErrorDescription() {
        return uIerror.getErrorDescription();
    }

    @Override
    public void sendEmail() {
         uIerror.sendEmail();
    }
}
