package org.example;

public class Pants implements Garment{

    @Override
    public void displayProfessional() {
        System.out.println("Professional Pants ");
    }

    @Override
    public void displayCasual() {
        System.out.println("Casual Pants");
    }

    @Override
    public void displayParty() {
        System.out.println("Party Pants");
    }
}
