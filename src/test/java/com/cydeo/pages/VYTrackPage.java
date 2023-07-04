package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VYTrackPage {
    public VYTrackPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginBtn;

    @FindBy (id = "user-menu")
    public WebElement userMenu;

    public void loginAsDriver() {
        userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginBtn.click();

    }

    public void loginAsSalesmanager() {
        userName.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
        password.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
        loginBtn.click();
    }

    public void loginAsStoremanager() {
        userName.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
        password.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
        loginBtn.click();
    }

    public void login(String username,String password){
        userName.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();

    }

    public void loginDynamic(String userType){
        userType = userType.replace(" ", "_");

        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");

        login(username,password);
    }
}
