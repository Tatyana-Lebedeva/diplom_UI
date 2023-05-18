import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;

public class ConstructorTest extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());

    @Before
    public void openPage() {
        openUrl();
    }

    @Test
    @DisplayName("Проверка перехода на вкладку Бургеры")
    public void clickOnBread() {
        mainPage.clickSauceButton();
        mainPage.clickBreadButton();
        mainPage.checkBunsIsDisplayed();
    }

    @Test
    @DisplayName("Проверка перехода на вкладку Соусы")
    public void clickOnSauce() {
        mainPage.clickSauceButton();
        mainPage.checkSaucesIsDisplayed();

    }

    @Test
    @DisplayName("Проверка перехода на вкладку Начинки")
    public void clickOnFiling() {
        mainPage.clickFilingsButton();
        mainPage.checkFillingsIsDisplayed();

    }

    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}
