package com.aip.javaPractice;

public class SampleTest {
    static {
        System.out.println("Selenium");
    }

    public static int a = 10;
    public int b = 20;

    public static void main(String[] test) {
        SampleTest sampleTest = new SampleTest();
        sampleTest.automation();
        webAutomation();
        System.out.println(a);
        System.out.println(sampleTest.b);

        SampleChildTest.test1();
        SampleChildTest sampleChildTest = new SampleChildTest();
        sampleChildTest.test2();
    }


    public void automation(){
        System.out.println("Automation Testing");
    }

    public static void webAutomation(){
        System.out.println("Web Automation");
    }


}
