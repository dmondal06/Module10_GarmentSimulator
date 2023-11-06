package org.example;

public class Tops implements Garment {

    @Override
    public void displayProfessional() {
        System.out.println("Profession Tops");
    }

    @Override
    public void displayCausal() {
        System.out.println("Casual Tops");
    }

    @Override
    public void displayParty() {
        System.out.println("Party Tops");
    }
}
