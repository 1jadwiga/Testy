package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    protected WebDriver driver;

    By emailCreate = By.id("email_create");
    By submitCreate = By.id("SubmitCreate");
    By createAccError = By.id("create_account_error");
    public SignInPage(WebDriver driver){
        this.driver = driver;
    }

    public SignInPage createAccount(String emailAddr) {
        driver.findElement(emailCreate).sendKeys(emailAddr);
        driver.findElement(submitCreate).click();
        return this;
    }

    public boolean hasCreateAccError() {
        try {
            driver.findElement(createAccError);
            return true;
        }
        catch (NoSuchElementException e) {
            return false;
        }
    }

}