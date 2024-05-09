package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testchrome {
    

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Windows Office 2024");

        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();

        Thread.sleep(3000);

        driver.close();


    }
}
