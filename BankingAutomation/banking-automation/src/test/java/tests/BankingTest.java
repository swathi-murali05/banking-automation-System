package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class BankingTest extends BaseTest {

    @Test
    public void openAppManual() {

        System.out.println("Application Opened");
        System.out.println("Perform actions manually...");
        System.out.println("Press ENTER to close browser");

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        driver.quit();
    }
}