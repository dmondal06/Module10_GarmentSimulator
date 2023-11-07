package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {
        Garment professionalTop = new Tops();
        Garment casualPant = new Pants();
        Garment partyShoe = new Shoes();

        // Display professional, casual, and party garments
        System.out.println("Professional Variant:");
        professionalTop.displayProfessional();
        casualPant.displayProfessional();
        partyShoe.displayProfessional();

        System.out.println("\nCasual Variant:");
        professionalTop.displayCasual();
        casualPant.displayCasual();
        partyShoe.displayCasual();

        System.out.println("\nParty Variant:");
        professionalTop.displayParty();
        casualPant.displayParty();
        partyShoe.displayParty();
    }
    }
