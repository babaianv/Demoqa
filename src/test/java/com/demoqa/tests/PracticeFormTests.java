package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountPositiveTest(){
        new PracticeFormPage(driver).hideIframes();
        new PracticeFormPage(driver)
                .enterPersonalData("Maria", "Priss", "mariap1234@gmail.com","12345678909")
                .selectGender("Female")
                .typeOfDate("19 March 1994")
                .addSubjects(new String[]{"Math", "Chemistry","English"})
                .selectHobby(new String[]{"Sports","Music"})
                .uploadFile("C:\\Tools\\me.png")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit()
                .verifyStudentFormTitle("Thanks for submitting the form");
    }



}
