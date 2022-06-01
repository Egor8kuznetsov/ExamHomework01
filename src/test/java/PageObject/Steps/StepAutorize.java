package PageObject.Steps;

import io.qameta.allure.Step;
import java.time.Duration;
import static PageObject.Elements.AutorizeData.*;
import static Utils.Configuration.getFromProperties;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static junit.framework.TestCase.assertEquals;

public class StepAutorize {
    @Step("Авторизация на сайте {Url} под пользователем {Login}")
    public static void autorize() {
        open(getFromProperties("Url"));
        login.shouldBe(visible, Duration.ofSeconds(60)).click();
        login.sendKeys(getFromProperties("Login"));
        password.shouldBe(visible, Duration.ofSeconds(60)).click();
        password.sendKeys(getFromProperties("Password"));
        loginbutton.click();

        assertEquals("Ошибка при авторизации", examinationOne.getText(),examinationOne.getText());
    }
}
