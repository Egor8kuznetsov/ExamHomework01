import Hooks.WebHooks;
import org.junit.Test;
import org.junit.jupiter.api.TestFactory;
import static PageObject.Steps.StepAutorize.autorize;
import static PageObject.Steps.StepNewBug.newBug;
import static PageObject.Steps.StepStatus.statusTask;
import static PageObject.Steps.StepTask.taskSection;

public class JiraTest extends WebHooks {
    @TestFactory

    @Test
    public void testJira() {
        autorize();
        taskSection();
        statusTask();
    }
    @Test
    public void testJira2() {
        autorize();
        newBug();
    }
}