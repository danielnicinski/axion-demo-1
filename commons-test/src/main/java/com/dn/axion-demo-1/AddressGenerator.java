package com.dn.axion;

import net.datafaker.Faker;

public class AddressGenerator {

    private static final Faker faker = new Faker();

    public static String zipCode() {
        return faker.regexify("[1-9]{1}[0-9]{4}");
    }
}
