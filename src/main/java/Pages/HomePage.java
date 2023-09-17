package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected WebDriver driver;

    private By signIn = By.className("login");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage goToSignIn()  {
        driver.findElement(signIn).click();
        return new SignInPage(driver);
    }
}