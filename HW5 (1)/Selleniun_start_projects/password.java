package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class password {
    static WebDriver browser;
    
    
    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\jerie\\Downloads\\geckodriver-v0.35.0-win32.zip\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
        browser.get(url);
    }
    

    @Test
    public void correctPassword() {
        browser.findElement(By.name("characters")).sendKeys("jeries*");
        browser.findElement(By.name("validate")).click();
        String expectedValue = "Invalid Value";
        String Result = browser.findElement(By.name("validation_message")).getText();
        assertNotEquals(Result, expectedValue);
    }

    @Test
    public void incorrectPasswordLength() {
        browser.findElement(By.name("characters")).sendKeys("hello2@");
        browser.findElement(By.name("validate")).click();
        String expectedValue = "valid Value";
        String Result = browser.findElement(By.name("validation_message")).getText();
        assertNotEquals(Result,expectedValue);
    }

    @Test
    public void incorrectPasswordCharacters() {
        browser.findElement(By.name("characters")).sendKeys("rere2@");
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getText();
        String expected = "valid Value";
        assertNotEquals(result, expected);
    }
	
}
