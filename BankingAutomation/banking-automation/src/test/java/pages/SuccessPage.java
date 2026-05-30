package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage {

    WebDriver driver;

    public SuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public void backToDashboard() {
        driver.findElement(By.tagName("button")).click();
    }
}
