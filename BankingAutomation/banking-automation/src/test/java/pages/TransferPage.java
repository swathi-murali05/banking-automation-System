package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

    WebDriver driver;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendMoney(String acc, String amount) {
        driver.findElement(By.id("account")).sendKeys(acc);
        driver.findElement(By.id("amount")).sendKeys(amount);
        driver.findElement(By.tagName("button")).click();
    }
}
