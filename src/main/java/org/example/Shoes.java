package org.example;

public class Shoes implements Garment{
    @Override
    public void displayProfessional() {
        System.out.println("Professional Shoes");
    }

    @Override
    public void displayCausal() {
        System.out.println("Casual Shoes");
    }

    @Override
    public void displayParty() {
        System.out.println("Party Shoes");
    }
}
