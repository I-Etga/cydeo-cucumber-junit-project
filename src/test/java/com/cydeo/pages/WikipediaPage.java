package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaPage {

    public WikipediaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement submitButton;

    @FindBy (id = "firstHeading")
    public WebElement header;

    @FindBy(xpath = "//div[.='Steve Jobs']")
    public WebElement imgHeader;

    @FindBy(id = "searchLanguage")
    public WebElement language;
}
