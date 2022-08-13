package com.nttdata.steps;
import com.nttdata.screens.LoginScreenSwagLabs;
import com.nttdata.screens.ProductsScreenSwagLabs;
import net.thucydides.core.annotations.Step;




public class SwagLabsLoginSteps {

    LoginScreenSwagLabs loginScreenSwagLabs;

    ProductsScreenSwagLabs productsScreenSwagLabs;


    @Step("Inciar")
    public void init()
    {
        loginScreenSwagLabs.iniciar();
    }

    @Step("Ingresar Usuario")
    public void ingresarUser(String user){
        loginScreenSwagLabs.llenarcampoUsuario(user);
    }
    @Step("Ingresar Password")
    public void ingresarContraseña(String password){
        loginScreenSwagLabs.llenarcampoContrasena(password);
    }

    @Step("Click en el Boton login")
    public void clicLogin(){
        loginScreenSwagLabs.clickButton();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return productsScreenSwagLabs.getResultText();
    }
    @Step("Click en el Boton login")
   public void itemsize(){
        productsScreenSwagLabs.Itemcant();
    }


}
