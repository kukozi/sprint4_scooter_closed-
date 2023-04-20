package ru.yandex.praktikum.site_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderContactPage {
    // WebDriver init
    private WebDriver webDriver;
    // Web elements
    // First order section "Для кого самокат"
    // Header "Для кого самокат"
    private By headerAboutRent = By.className("Order_Header__BZXOb");
    // Name input
    private By nameInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[1]/input");
    // Surname input
    private By surnameInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[2]/input");
    // Address input
    private By addressInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[3]/input");
    // Phone number input
    private By phoneNumberInputField = By.xpath("//div[@class='Order_Form__17u6u']/div[5]/input");
    // Metro station field
    private By metroStationField = By.className("select-search__input");
    // Metro station dropdown selector
    private By metroStationSelector = By.className("select-search__select/*");
    // "Далее" button
    private final By nextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']/button");
    public OrderContactPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    // Test methods
    //
    public OrderContactPage setName(String name){
        webDriver.findElement(nameInputField).sendKeys(name);
        return this;
    }

    public OrderContactPage setSurname(String surname){
        webDriver.findElement(surnameInputField).sendKeys(surname);
        return this;
    }

    public OrderContactPage setAddress(String address){
        webDriver.findElement(addressInputField).sendKeys(address);
        return this;
    }

    public OrderContactPage setMetroStation(String metroStation){
        webDriver.findElement(metroStationField).sendKeys(metroStation);
        webDriver.findElement(metroStationSelector).click();
        return this;
    }

    public OrderContactPage setPhoneNumber(String number){
        webDriver.findElement(phoneNumberInputField).sendKeys(number);
        return this;
    }

    public OrderContactPage clickOnNextButton(){
        webDriver.findElement(nextButton).click();
        return this;
    }
    // Fill first order section with contact info
    public OrderContactPage fillInOrderContactInfo(String name, String surname,
                                                   String address, String metroStation, String number){
        setName(name);
        setSurname(surname);
        setAddress(address);
        setMetroStation(metroStation);
        setPhoneNumber(number);
        return this;
    }
}