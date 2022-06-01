package PageObject.Elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class AutorizeData {
    public static SelenideElement login = $x("//input[@name='os_username']");
    public static SelenideElement password = $x("//input[@name='os_password']");
    public static SelenideElement loginbutton = $x("//input[@value='Войти']");
    public static SelenideElement examinationOne = $x("//h3[text()='Назначенные мне']");
}
