package com.paperflite;

import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PercyTest {
    private static WebDriver driver;
    private static Percy percy;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
        driver = new FirefoxDriver(options);
        percy = new Percy(driver);

        driver.get("https://app.paperflite.com/");
        percy.snapshot("Java example");
    }
}