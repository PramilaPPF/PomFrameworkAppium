package com.qa.amazon.abstraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Page {
	
	public void waitForElementPresent(By locator);
	public String getElementText(By locator);
	public WebElement getElement(By locator);
	
}
