package org.example;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        executeCustomSelenide();
    }

    public static String executeCustomSelenide() {
        open("https://www.example.com/custom-web-form.html");
        return $(By.tagName("h1")).text();
    }
}