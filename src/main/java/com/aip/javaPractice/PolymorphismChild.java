package com.aip.javaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolymorphismChild extends PolymorphismParent{
    public static WebDriver driver;

    public PolymorphismChild(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) {
        PolymorphismChild polymorphismChild = new PolymorphismChild(driver);
        polymorphismChild.registration();
    }

    @Override
    public void registration(){
        System.out.println("Register to the application");
        System.out.println("Test");
        System.out.println("Selenium");
    }

    @FindBy(css = "")
    private WebElement loginButton;

    public int sum(int a, int b){
        return a+b;
    }

    public double sum(double a, int b){
        return a+b;
    }

    public double sum(int a, double b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void navigation(){
        WebElement element = driver.findElement(By.cssSelector(""));
        clickOnElement(loginButton);
        clickOnElement(By.xpath("test"));
    }
}
