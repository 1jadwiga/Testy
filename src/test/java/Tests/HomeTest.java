package Tests;

import Pages.HomePage;
import Pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HomeTest {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setUp() {
        driver.get("http://automationpractice.pl");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void emptyRegistrationEmailInput() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = homePage.goToSignIn();
        signInPage.createAccount("");
        assertThat(signInPage.hasCreateAccError()).isTrue();
    }
}
