package com.lytester.Lession5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Demo HTML Attribute");

        //Đầu tiên khai báo 1 cái webdriver
        WebDriver driver;
        driver = new ChromeDriver(); // Chọn loại trình duyệt muốn khởi chạy

        // Phóng to trình duyệt
        driver.manage().window().maximize();

        // set giá trị timeout để tìm kiếm element
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("123456");

        //driver.findElement(By.linkText("Forgot Password?")).click(); //Tìm kiếm theo text chính xác

        //driver.findElement(By.partialLinkText("Password?")).click(); // theo text tương đối

        //driver.findElement(By.tagName("button")).click();

        driver.findElement(By.className("btn-primary")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
