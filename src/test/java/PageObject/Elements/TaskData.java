package PageObject.Elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TaskData {
    public static SelenideElement buttonProject = $x("//a[text()='Проекты']");
    public static SelenideElement buttonTest = $x("//a[text()='Test (TEST)']");
    public static SelenideElement task = $x("//span[@class='aui-icon aui-icon-large icon-sidebar-issues aui-iconfont-issues']");
    public static SelenideElement taskNumber = $x("//div[@class='showing']/span");

    public static SelenideElement examinationTwo = $x("//span[text()='Открытые задачи']");
}
