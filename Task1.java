package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("fatima");
        driver.findElement(By.id("customer.lastName")).sendKeys("hayat");
        driver.findElement(By.id("customer.address.street")).sendKeys("street 123");
        driver.findElement(By.id("customer.address.city")).sendKeys("Alexandria");
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("21100");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-345-7676");
        driver.findElement(By.id("customer.ssn")).sendKeys("123432334");
        driver.findElement(By.id("customer.username")).sendKeys("fatimahayat@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("abc@123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("abc@123");
        String url=driver.getCurrentUrl();
        System.out.println(url);
       String title= driver.getTitle();
        System.out.println(title);
        if(title.equals("ParaBank | Register for Free Online Account Access")){
            System.out.println("title is correct");
        }else{
            System.out.println("title is incorrect");
        }
        driver.quit();
    }
}
