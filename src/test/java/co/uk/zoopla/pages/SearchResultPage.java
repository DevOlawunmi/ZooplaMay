package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy (css = ".listing-results-price.text-price")
    private List <WebElement> results;

    public void isPageTitleDisplayed(String property){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void pageTitleContainsLocation(String location){
        String title = pageTitle.getText();
        Assert.assertTrue(title.contains(location));
    }
    public void isCorrectURLDisplayedForSearch(String location){
        driver.getCurrentUrl().contains(location.toLowerCase());
    }

    public ProductDetailsPage clickOnAnyResult(){
        Random random  = new Random(); //we want a new random number
        int randomNumber = random.nextInt(results.size()-1);
        results.get(randomNumber).click();
        return new ProductDetailsPage(driver);
    }
}
