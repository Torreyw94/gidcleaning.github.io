package com.app.margaritahousecleaning;

public class UserGoogleAccount {

    public String fullName, email;

    public UserGoogleAccount() {
    }


    public UserGoogleAccount(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


