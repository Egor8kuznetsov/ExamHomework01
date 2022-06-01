package PageObject.Steps;

import io.qameta.allure.Step;
import java.time.Duration;
import static PageObject.Elements.BugData.*;
import static PageObject.Elements.TaskData.*;
import static Utils.Configuration.getFromProperties;
import static com.codeborne.selenide.Condition.visible;
import static junit.framework.TestCase.assertEquals;

public class StepNewBug {
    @Step("Создание нового бага и изменение статуса на 'ГОТОВО'")
    public static void newBug () {
        create.click();
        subject.shouldBe(visible, Duration.ofSeconds(60)).click();
        subject2.sendKeys(getFromProperties("TaskName"));
        textClick.click();
        description.shouldBe(visible, Duration.ofSeconds(60)).click();
        description.sendKeys(getFromProperties("TaskInfo"));
        environment.click();
        clickCreate.click();

        buttonProject.click();
        buttonTest.click();
        switchFilter.click();
        createByMe.click();
        testBug12.click();
        String statusProject = "СДЕЛАТЬ";
        assertEquals(statusPr.getText(), statusProject);
        buisnessProcess.click();
        done.click();
        String statusProjectNew = "ГОТОВО";
        while (!statusPr.getText().equals("ГОТОВО")) {
            statusPr.getText();
        }
        assertEquals(statusPr.getText(), statusProjectNew);

    }
}
