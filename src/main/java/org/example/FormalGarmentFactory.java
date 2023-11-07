package org.example;

 class FormalGarmentFactory implements GarmentFactory {

    public Tops createTops() {
        return new FormalTops();
    }

    public Pants createPants() {
        return new FormalPants();
    }

    public Shoes createShoes() {
        return new FormalShoes();
    }
}