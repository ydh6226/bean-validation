package com.beanvalidation.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Address {

    private final String city;

    private final String gu;

    private final int number;

    Address(String city, String gu, int number) {
        this.city = city;
        this.gu = gu;
        this.number = number;
    }
}
