package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.site_model.MainPageUp;
import ru.yandex.praktikum.site_model.MainPageFAQ;
import java.util.concurrent.TimeUnit;

public class CheckDropdownsFAQ extends TestMain {
    @Test
    public void checkMainPage(){
        new MainPageUp(driver)
                .openMainPage()
                .closeCookieWindow()
                .scrollMainPageToFAQPage();
        try {
            TimeUnit.SECONDS.sleep(10);
        }
        catch (Exception e) {

        }
                //.isHiddenElementDisplayedAfterClick();
    }
}