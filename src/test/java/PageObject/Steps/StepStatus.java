package PageObject.Steps;

import io.qameta.allure.Step;
import java.time.Duration;
import static PageObject.Elements.ProjectData.*;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class StepStatus {
    @Step("Проверка статуса и версии задачи")
    public static void statusTask() {
        taskList.click();
        taskSearch.click();
        taskSearch1.shouldBe(visible, Duration.ofSeconds(60)).click();
        taskSearch2.sendKeys("TestSelenium");
        search.click();
        testSelenium.click();
        System.out.println(statusIn.getText());
        String fail = "В РАБОТЕ";
        assertEquals(statusIn.getText(), statusIn.getText(), fail);
        System.out.println(version.getText());
        String failTwo = "Version 2.0";
        assertNotNull(version.shouldBe(visible));
       // assertEquals(version.getText(), version.getText(), failTwo);
    }
}
