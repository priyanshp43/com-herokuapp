package browsertesting;

/**
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Enter the email in the email field.
 * 7. Enter the password in the password field.
 * 8. Click on the Login Button.
 * 9. Print the current URL.
 * 10. Refresh the page.
 * 11. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get(baseUrl);

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Print the current URL
        System.out.println("The Current URL is : " + driver.getCurrentUrl());

        // Print the page source
        System.out.println(" Page source is: " + driver.getPageSource());

        // Enter the email in the email field.
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("priyanshp904@gmail.com");

        // Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("12345678");

        // Click on the Login Button
        WebElement loginButton = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
        loginButton.click();

        // Print the current URL
        System.out.println(" The Current URL is after login : "+ driver.getCurrentUrl());

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();

    }

}
