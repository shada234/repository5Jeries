package Selleniun_start_projects.Selleniun_start_projects;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Selenium_calculatorTest {
    static WebDriver browser;

    @BeforeEach
    public void setup() {
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jerie\\Downloads\\geckodriver-v0.35.0-win32.zip\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/styled/apps/triangle/triangle001.html");
    }

    @Test
    public void testEquilateralTriangle() {
        browser.findElement(By.name("side1")).sendKeys("3");
        browser.findElement(By.name("side2")).sendKeys("3");
        browser.findElement(By.name("side3")).sendKeys("3");
        browser.findElement(By.id("identify-triangle-action")).click();

        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Equilateral", result);
    }


    @Test
    public void testIsoscelesTriangle() {
        browser.findElement(By.name("side1")).sendKeys("6");
        browser.findElement(By.name("side2")).sendKeys("6");
        browser.findElement(By.name("side3")).sendKeys("8");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Isosceles", result);
    }


    @Test
    public void testIsoscelesTriangle() {
        browser.findElement(By.name("side1")).sendKeys("7");
        browser.findElement(By.name("side2")).sendKeys("9");
        browser.findElement(By.name("side3")).sendKeys("7");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Isosceles", result);
    }
    

    @Test
    public void testIsoscelesTriangle() {
        browser.findElement(By.name("side1")).sendKeys("6");
        browser.findElement(By.name("side2")).sendKeys("6");
        browser.findElement(By.name("side3")).sendKeys("4");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Isosceles", result);
    }
    
    

    @Test
    public void testNotATriangle() {
        browser.findElement(By.name("side1")).sendKeys("2");
        browser.findElement(By.name("side2")).sendKeys("2");
        browser.findElement(By.name("side3")).sendKeys("5");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Error: Not a Triangle", result);
    }

    
    

    @Test
    public void testNotATriangle() {
        browser.findElement(By.name("side1")).sendKeys("2");
        browser.findElement(By.name("side2")).sendKeys("7");
        browser.findElement(By.name("side3")).sendKeys("3");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Error: Not a Triangle", result);
    }

    
    

    @Test
    public void testNotATriangle() {
        browser.findElement(By.name("side1")).sendKeys("10");
        browser.findElement(By.name("side2")).sendKeys("2");
        browser.findElement(By.name("side3")).sendKeys("3");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Error: Not a Triangle", result);
    }


    
    @Test
    public void testScaleneTriangle() {
        browser.findElement(By.name("side1")).sendKeys("3");
        browser.findElement(By.name("side2")).sendKeys("4");
        browser.findElement(By.name("side3")).sendKeys("5");
        browser.findElement(By.id("identify-triangle-action")).click();
        String result = browser.findElement(By.id("triangle-type")).getText();
        assertEquals("Scalene", result);
    }
    
    
    @Test
    public void  Impossible() {
        browser.findElement(By.name("side1")).sendKeys("1");
        browser.findElement(By.name("side2")).sendKeys("2");
        browser.findElement(By.name("side3")).sendKeys("5");
        browser.findElement(By.id("identify")).click();
        String result = browser.findElement(By.id("triangleType")).getText();
        assertEquals(" Impossible", result);
    }
    
    public void  Impossible() {
        browser.findElement(By.name("side1")).sendKeys("10");
        browser.findElement(By.name("side2")).sendKeys("2");
        browser.findElement(By.name("side3")).sendKeys("3");
        browser.findElement(By.id("identify")).click();
        String result = browser.findElement(By.id("triangleType")).getText();
        assertEquals(" Impossible", result);
    }
    
    public void  Impossible() {
        browser.findElement(By.name("side1")).sendKeys("3");
        browser.findElement(By.name("side2")).sendKeys("8");
        browser.findElement(By.name("side3")).sendKeys("2");
        browser.findElement(By.id("identify")).click();
        String result = browser.findElement(By.id("triangleType")).getText();
        assertEquals(" Impossible", result);
    }
    




    @AfterEach
    public void tearDown() {
        if (browser != null) {
            browser.quit();
        }
    }
}
