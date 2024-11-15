package com.aip.javaPractice;

public class EncapChild extends EncapParent{
    public static void main(String[] args) {
        EncapChild encapChild = new EncapChild();

        encapChild.getA();
        encapChild.setName("Appium");
        System.out.println(encapChild.getName());
    }
}
