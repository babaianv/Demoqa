package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SelectMenuPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getWidgets().hideIframes();
        new SidePanel(driver).getSelectMenu().hideIframes();
    }

    @Test
    public void selectOldStyleTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).selectOldStyle("Red");
    }

    @Test
    public void multiSelectTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).multiSelect(new String[]{"Green", "Blue","Black"});
    }

    @Test
    public void standardMultiSelectTest(){
        new SelectMenuPage(driver).hideIframes();
        new SelectMenuPage(driver).standardMultiSelect(2);
    }

}
