package PageObject.Elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BugData {
    public static SelenideElement create = $x("//li[@id='create-menu']");
    public static SelenideElement clickBug = $x("(//input[@role='combobox'])[2]");
    public static SelenideElement subject = $x("//input[@class='text long-field']");
    public static SelenideElement subject2 = $x("//input[@class='text long-field focus-visible']");
    public static SelenideElement textClick = $x("(//button[text()='Текст'])[1]");
    public static SelenideElement environment = $x("(//button[text()='Текст'])[2]");
    public static SelenideElement description = $x("//textarea[@name='description']");
    public static SelenideElement tryut = $x("//textarea[@name='environment']");
    public static SelenideElement clickCreate = $x("//input[@value='Создать']");


    public static SelenideElement switchFilter = $x("//button[text()='Переключить фильтр']");
    public static SelenideElement createByMe = $x ("//a[text()='Сообщенные мной']");
    public static SelenideElement testBug12 = $x("(//a[@class='splitview-issue-link'])[1]");
    public static SelenideElement buisnessProcess = $x("(//span[@class='dropdown-text'])[2]");
    public static SelenideElement done = $x("//span[text()='Выполнено']");
    public static SelenideElement statusPr = $x("//span[@class='value']");
}
