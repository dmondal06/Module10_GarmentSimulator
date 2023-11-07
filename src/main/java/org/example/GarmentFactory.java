package org.example;

/**
 * This interface is a abstract factory interface
 */
 interface GarmentFactory {
    Tops createTops();
    Pants createPants();
    Shoes createShoes();

}

