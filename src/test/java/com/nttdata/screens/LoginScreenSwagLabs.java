package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;





public class LoginScreenSwagLabs extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    public WebElement inputUser;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    public WebElement inputPassword;
    @AndroidFindBy(accessibility = "test-LOGIN")
    public WebElement btnLogin;


    public void iniciar(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    public void llenarcampoUsuario(String user){
/*        inputUser.click();*/
        inputUser.sendKeys(user);
    }
    public void llenarcampoContrasena(String password){
/*        inputPassword.click();*/
        inputPassword.sendKeys(password);
    }


    public void clickButton(){
        btnLogin.click();
    }


}
