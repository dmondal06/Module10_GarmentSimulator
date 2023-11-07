package org.example;

 class CasualGarmentFactory implements GarmentFactory {
    public Tops createTops() {
        return new CasualTops();
    }

    public Pants createPants() {
        return new CasualPants();
    }

    public Shoes createShoes() {
        return new CasualShoes();
    }
}