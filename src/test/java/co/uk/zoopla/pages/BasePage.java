package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib {
    public Select select;
    String BASE_URL = "https://www.zoopla.co.uk/";

    public void launchURL(){
        driver.navigate().to(BASE_URL);
    }
}
