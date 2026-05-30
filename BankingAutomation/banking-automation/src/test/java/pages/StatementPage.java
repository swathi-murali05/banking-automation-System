package pages;

import org.openqa.selenium.WebDriver;

public class StatementPage {

    WebDriver driver;

    public StatementPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTransactionPresent() {
        return driver.getPageSource().contains("Transfer");
    }
}