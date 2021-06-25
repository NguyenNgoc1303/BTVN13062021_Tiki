package runner;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tiki_Run {
    WebDriver driver;

    @Test
    public void search() {
        // open driver chrome
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();
        //tim sp asus
        WebElement txtTextBox = driver.findElement(By.xpath("//input[@data-view-id='main_search_form_input']"));
        WebElement btnSearch = driver.findElement(By.xpath("//button[@data-view-id='main_search_form_button']"));
        txtTextBox.sendKeys("Asus");
        btnSearch.click();
        //tat popup
//       WebElement popupKM = driver.findElement(By.xpath("//div[@id='normal-slidedown']//button[@id='onesignal-slidedown-cancel-button']"));
//       popupKM.click();
        //click sp asus bat ky
        WebElement asus = driver.findElement(By.xpath("//*[contains(span,'Laptop Asus ExpertBook P2451F')][1]"));
        asus.click();
        // hien thi thong tin sp
        WebElement nameDetail  = driver.findElement(By.xpath("//div/h1"));
        nameDetail.getText();
        WebElement price = driver.findElement(By.xpath("//span[@class='product-price__current-price']"));
        price.getText();
        WebElement IMG  = driver.findElement(By.xpath("//div[@class='review-images__list']/a[1]"));
        IMG.isSelected();
        WebElement btnMua = driver.findElement(By.xpath("//button[@class='btn btn-add-to-cart']"));
        btnMua.click();
    }

    @After
    public void tearDown() {
        driver.quit();

    }
}
