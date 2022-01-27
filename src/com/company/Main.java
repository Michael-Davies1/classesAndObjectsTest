package com.company;

public class Main {

    public static void main(String[] args) {
        component newComponent = new component("hardrive", 5.4);
        laptop newLaptop = new laptop("38927429479287", "HP", "ME", "has mushrooms", "get rid of mushrooms", 1);
        newLaptop.addComponent(newComponent);
        System.out.println(newComponent.getName());

    }
}
