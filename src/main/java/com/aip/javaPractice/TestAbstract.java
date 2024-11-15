package com.aip.javaPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAbstract extends InterfaceImplementation{
    public static void main(String[] args) {
        TestAbstract testAbstract = new TestAbstract();
//        AbstractImplementation abstractImplementation = new TestAbstract();
//        AbstractAIP abstractAIP = new TestAbstract();

        InterfaceAIP interfaceAIP = new TestAbstract();
        WebDriver driver = new ChromeDriver();

    }
}
