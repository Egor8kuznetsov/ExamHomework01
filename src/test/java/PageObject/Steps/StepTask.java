package PageObject.Steps;

import io.qameta.allure.Step;
import static junit.framework.TestCase.assertEquals;
import static PageObject.Elements.TaskData.*;

public class StepTask {
    @Step("Проверка количества задач, находящихся в работе")
    public static void taskSection() {
        buttonProject.click();
        buttonTest.click();
        task.click();
        System.out.println("Количество задач: " + taskNumber.getText().substring(5));
        assertEquals("Ошибка при переходе к списку задач", examinationTwo.getText(), examinationTwo.getText());
    }
}
