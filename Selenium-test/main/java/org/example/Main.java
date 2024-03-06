package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        performFormSubmission();
    }

    public static String performFormSubmission() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.example.com/form-page");

        String pageTitle = driver.getTitle();

        System.out.println("Current page title: " + pageTitle);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));

        WebElement resultMessage = driver.findElement(By.tagName("h1"));

        String formResult = resultMessage.getText();
        System.out.println("Form submission result: " + formResult);

        driver.quit();

        return formResult;
    }
}