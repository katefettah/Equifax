package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserUtils {

        public static void scrollDown() {

            JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
            // ScrollDown
            js.executeScript("window.scrollBy(0,500)", "");  // OR   js.executeScript("scroll(0,500)");
            //ScrollUp
            js.executeScript("window.scrollBy(0,-250)", "");  // OR   js.executeScript("scroll(0,-250)");

            //This will scroll the page Horizontally till the element is found
//        js.executeScript("arguments[0].scrollIntoView();", Element);



        }
    }

