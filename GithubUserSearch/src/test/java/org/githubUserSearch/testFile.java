package org.githubUserSearch;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class testFile {
    @Test
    public void Demo1() {
        try {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setBrowserName("chrome");
            dc.setPlatform(Platform.LINUX);
            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.1:4444/wd/hub"), dc);
            driver.manage().window().maximize();
            driver.get("https://gh-users-search.netlify.app/");
            System.out.println("Title of the page is: " + driver.getTitle());
            driver.quit();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void Demo2() {
        try {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setBrowserName("chrome");
            dc.setPlatform(Platform.LINUX);
            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.1:4444/wd/hub"), dc);
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            driver.quit();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void Demo3() {
        try {
            DesiredCapabilities dc = new DesiredCapabilities();
            dc.setBrowserName("chrome");
            dc.setPlatform(Platform.LINUX);
            WebDriver driver = new RemoteWebDriver(new URL("http://172.18.0.1:4444/wd/hub"), dc);
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            System.out.println("Title of the page is: " + driver.getTitle());
            driver.quit();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
