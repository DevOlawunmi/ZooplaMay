package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "search-input-location")
    private WebElement searchField;
    @FindBy (id = "forsale_price_min")
    private WebElement minPrice;
    @FindBy(id = "forsale_price_max")
    private WebElement maxPrice;
    @FindBy (id = "property_type")
    private WebElement propertyType;
    @FindBy (id = "beds_min")
    private WebElement noOfBeds;
    @FindBy(id = "search-submit")
    private WebElement searchButton;
    @FindBy (className = "ui-button-primary ui-cookie-accept-all-medium-large")
    private WebElement acceptCookies;
}