package com.beanvalidation.model;

import lombok.Getter;

@Getter
public class Person {

    private final Long seq;

    private final String name;

    private Address address;

    public Person(Long seq, String name, Address address) {
        this.seq = seq;
        this.name = name;
        this.address = address;
    }
}
