package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

public class AmazonSearch extends TestBase {
    //1. Visit amazon.com Page
    //2. Search for Book 'qa testing for beginners'
    //3. Click on 1st item in the listed results.
    //4. Before Click on add to cart Add to Cart asset price from Step3.
    //5. Click on Add to Cart.
    //6. Before Click on Proceed to Checkout asset price from Step3.
    //7. Click on proceed to checkout
    //5. On the checkout page assert price from Step3.
    @Test
    public void amazonSearch() {
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBar.sendKeys(ConfigurationReader.getProperty("search")+ Keys.ENTER);
        amazonPage.firstSearch.click();

        BrowserUtils.scrollDown();
        Assert.assertEquals(amazonPage.priceBeforeToCart.getText(),"$47.49");

        amazonPage.addToCart.click();
        Assert.assertEquals(amazonPage.proceedPrice.getText(),"$47.49");
        amazonPage.proceedToCheckout.click();

    }
}