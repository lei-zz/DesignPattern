package com.zz.simpleFactory;

public class ConcreteProduct implements Product {
    @Override
    public String productName() {
        return "ConcreteProduct";
    }
}