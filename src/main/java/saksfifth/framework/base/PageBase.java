package saksfifth.framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import saksfifth.framework.utils.DriverFactory;
import saksfifth.framework.utils.ExplicitWaitUtils;

import java.util.List;


public class PageBase {

    protected WebDriver driver = DriverFactory.getInstance().getDriver();


    /**   delay for a certain time**/
    public void delayFor(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** Mouse hover**/
    public void mouseOn(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element)
                .perform();
    }


    //This method returns single webelements
    public WebElement getElementList(List<WebElement> elements, String text) {

        WebElement returningElement = null;
        for (int i = 0; i < elements.size(); i++){
            WebElement element = elements.get(i);
            if(element.getText().contentEquals(text)){
                returningElement = element;
                break;
            }else {
                System.out.println("Did not find the element");
            }
        }
        return returningElement;
    }

    public void selectOption(WebElement element, String text){
        Select option = new Select(element);
        option.selectByVisibleText(text);
    }


    /**
     * Handle the popup that comes with trigger.
     * */

    public void closeTriggerPopup(){
        ExplicitWaitUtils wait = new ExplicitWaitUtils(driver);
        WebElement popupDialge = null;
        try{
            popupDialge = wait.waitForElement(By.xpath("//div[@class='fsrFloatingContainer']"), 01);

        }catch(Exception ex){
            //System.out.println(ex.getMessage());
        }

        if(popupDialge!=null){
            WebElement closeButton = popupDialge.findElement(By.cssSelector(".fsrCloseBtn"));
            closeButton.click();
        }
        else {
            System.out.println("continue scripts");
        }
    }

    /**
     * uses for highlight the element on the page
     * */
    public void highlightElement(WebElement element){
        for (int i = 0; i < 3; i++) {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "border: 2px solid green;");
            delayFor(500);
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "");
            delayFor(500);
        }
    }



}
