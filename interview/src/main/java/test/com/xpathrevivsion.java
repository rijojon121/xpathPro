package test.com;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathrevivsion {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Mac");

       Boolean logoStatus =  driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
       System.out.println(logoStatus);

      List<WebElement> headerLinks =  driver.findElements(By.className("list-inline-item"));  //by class name and tag name get 


      System.out.println("Total number of hear links" + headerLinks.size());

      Boolean navItemstatusDesktop =  driver.findElement(By.xpath("//a[text()='Desktops']")).isDisplayed();
      System.out.println("Ist nav item - desktop status:  "+ navItemstatusDesktop);

      // XPath with inner text 

      driver.findElement(By.xpath("//a[text()='Desktops']")).click();

       Boolean displaystatusforFeatured =  driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
       System.out.println("display status for featured" + displaystatusforFeatured);

       //xpath with contain method 

       driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Macbook");
       driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).clear();

       Thread.sleep(3000);

       
       //xpath with starts with
       
       driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("mobile");
       


        Thread.sleep(2000);

        driver.close();


        
    }
}
