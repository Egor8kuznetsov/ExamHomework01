package PageObject.Elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectData {
    public static SelenideElement taskList = $x("//a[text()='Задачи']");
    public static SelenideElement taskSearch = $x("//a[text()='Поиск задач']");
    public static SelenideElement taskSearch1 = $x("//input[@class='search-entry text medium-field ajs-dirty-warning-exempt']");

    public static SelenideElement taskSearch2 = $x("//input[@class='search-entry text medium-field ajs-dirty-warning-exempt focus-visible']");
    public static SelenideElement search = $x("//button[@original-title='Поиск задач']");
    public static SelenideElement testSelenium = $x("//a[text()='TEST-374']");
    public static SelenideElement statusIn = $x("//span[@id='status-val']");
    public static SelenideElement version = $x("//span[text()='Version 2.01']");
}
