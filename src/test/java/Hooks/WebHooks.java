package Hooks;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

public class WebHooks {

    @Before
    public void setWebDriverFormat() {
        Configuration.startMaximized = true;
        String listenerName = "AllureSelenide";
        if (!(SelenideLogger.hasListener(listenerName)))
            SelenideLogger.addListener(listenerName,
                    new AllureSelenide()
                            .screenshots(true)
                            .savePageSource(false));

    }

    @After
    public void driverClose() {
        WebDriverRunner.closeWebDriver();
    }

}
