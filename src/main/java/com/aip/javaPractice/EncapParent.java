package com.aip.javaPractice;

public class EncapParent {
    private int a = 10;

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getA() {
        System.out.println("value a :: " + a);
        return a;
    }
}
