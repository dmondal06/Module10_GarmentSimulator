package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Driver {
    public static void main(String[] args) {
        GarmentFactory formalFactory = new FormalGarmentFactory();
        GarmentFactory casualFactory = new CasualGarmentFactory();

        Tops formalTops = formalFactory.createTops();
        Pants formalPants = formalFactory.createPants();
        Shoes formalShoes = formalFactory.createShoes();

        Tops casualTops = casualFactory.createTops();
        Pants casualPants = casualFactory.createPants();
        Shoes casualShoes = casualFactory.createShoes();

        System.out.println("Professional Outfit: " + formalTops.getVariant() + ", "
                + formalPants.getVariant() + ", " + formalShoes.getVariant());
        System.out.println("Casual Outfit: " + casualTops.getVariant() + ", "
                + casualPants.getVariant() + ", " + casualShoes.getVariant());
    }

}
