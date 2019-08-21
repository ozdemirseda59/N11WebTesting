package utilities;

import com.sun.jna.platform.unix.X11;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    protected void waitAndClick (By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    protected void waitAndClear (By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).clear();
    }

    protected void waitVisibility(By by) { wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by)); }

    protected void waitImplicitly() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    protected List<WebElement> waitVisibilityAndFindElements (By by) { return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));}

    protected List<WebElement> waitPresenceAndFindElements(By by ) {return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));}

    protected WebElement waitVisibilityAndFindElement (By by) { return wait.until(ExpectedConditions.visibilityOfElementLocated(by)); }

    protected WebElement waitPresenceAndFindElement(By by ) {return wait.until(ExpectedConditions.presenceOfElementLocated(by));}

    protected String getText(By by) {
        return waitVisibilityAndFindElement(by).getText();
    }

    protected void sendText (By by, String text) {
        waitVisibilityAndFindElement(by).sendKeys(text);
    }

    //Move Method
    public void move(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(waitVisibilityAndFindElement(by));
        actions.build().perform();
    }

    //Assert By
    public void assertEquals(By by, String expectedText) {
        waitVisibility(by);
        Assert.assertEquals(getText(by), expectedText);
    }

    //Assert Text
    public void assertEqualsText(String existingText, String expectedText) { Assert.assertEquals(existingText, expectedText); }

    //Verify Page’s Url Condition
    public void checkForUrlContains (String expected) throws Exception { wait.until(ExpectedConditions.urlContains(expected)); }

    public void checkForTitleEquals(String expected){wait.until(ExpectedConditions.titleIs(expected));}

    //Assert By
    public void checkForTextContains(By by, String expectedText) {
        waitVisibility(by);
        expectedText.contains(getText(by));
    }

    public  void clickRandomElement(By elementBy){
        List<WebElement> elementByList =waitVisibilityAndFindElements(elementBy);
        if(elementByList.size()>0) {
            Random rnd=new Random();
            int index=rnd.nextInt(elementByList.size());
            elementByList.get(index).click();
        }
    }

    //Take Screenshot
    public void takeScreenshot(String screenshotName) throws Exception {
        TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshots/" + screenshotName + ".png"));
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void backNavigate(){ driver.navigate().back();}

    protected void sleep (long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}