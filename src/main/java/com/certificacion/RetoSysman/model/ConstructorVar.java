package com.certificacion.RetoSysman.model;

public class ConstructorVar
{
    private String userName;
    private String password;
    private String baseGrabale;

    private String mes;


    public ConstructorVar(String userName, String password, String baseGrabale)
    {
        this.userName = userName;
        this.password = password;
        this.userName = userName;
        //this.mes = mes;
        this.baseGrabale = baseGrabale;

    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBaseGrabale() {
        return baseGrabale;
    }

    public void setBaseGrabale(String baseGrabale) {
        this.baseGrabale = baseGrabale;
    }
}


