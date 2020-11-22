package com.example.python_qcm.Model;

public class User {
    private String prenom;

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "User{" +
                "prenom='" + prenom + '\'' +
                '}';
    }
}
