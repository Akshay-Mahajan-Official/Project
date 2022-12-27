package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonActions {

	WebDriver driver;
	private Logger logger = LoggerFactory.getLogger(CommonActions.class);

	private void highlightElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].style.border='2px dashed red'", element);
	}

	private void enters_data(String value, WebElement element) {
		highlightElement(element);
		logger.info("Entering text : " + value);
		element.sendKeys(value);
	}

	private void click_on_element(WebElement element) {
		logger.info("Clicking on : " + element.getText());
		highlightElement(element);
		element.click();
	}

	public void clickUsingJs(WebElement element) throws InterruptedException {
		wait(2000);
		visibilityOfElement(element);

		if (element.isDisplayed() && element.isEnabled()) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			logger.info("Click using JS on : " + element.getText());
			highlightElement(element);
			js.executeScript("argument[0].click();", element);
		}
		wait(2000);
	}

	private boolean visibilityOfElement(WebElement element) {
		logger.info("Element visible on screen : " + element.getText());
		return element.isDisplayed();

	}
}
