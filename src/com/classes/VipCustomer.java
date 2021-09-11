package com.classes;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("defaul name","445","mustafa.glr@hotmail.com");
    }

    public VipCustomer(String name,String creditLimit){
        this(name,creditLimit,"unknown@email.com");
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}





