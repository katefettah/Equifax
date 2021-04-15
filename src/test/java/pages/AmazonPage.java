package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    WebDriver driver;
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBar;
    @FindBy(xpath = "(//img[@src='https://m.media-amazon.com/images/I/816Oezch+UL._AC_UL320_.jpg'])[1]")
    public WebElement firstSearch;
    @FindBy(id = "newBuyBoxPrice")
    public WebElement priceBeforeToCart;
    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;
    @FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
    public WebElement proceedToCheckout;
    @FindBy(xpath ="(//span[@class='a-color-price hlb-price a-inline-block a-text-bold'])[1]")
    public WebElement proceedPrice;
}

