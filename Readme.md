### Данный проект предназначен для проведения ряда тестов на сайте [edujira](https://edujira.ifellow.ru/secure/Dashboard.jspa).  
***
### Проект реализован при помощи следующих инструментов:  
- *Junit*  
- *Maven*  
- *Selenide*  
- *Allure*  
***  
#### В данном проекте присутствует разделение на 2 основных теста:  
1. Тест проверяет актуальное количество задач, а также статус и версию задачи TestSelenium.  
Также в данном тесте допущена умышленная ошибка, которую выдаст отчет при прохождении шага `statusTask();`. 
````
@Test
public void testJira() {
autorize();
taskSection();
statusTask();
}
````  
2. Тест заводит на сайте новую задачу и проводит ее до состояния "*ГОТОВО*"
````  
@Test
public void testJira2() {
autorize();
newBug();
}   
````