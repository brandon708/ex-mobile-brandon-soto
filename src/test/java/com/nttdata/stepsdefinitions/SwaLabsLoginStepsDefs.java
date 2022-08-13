package com.nttdata.stepsdefinitions;


import com.nttdata.steps.SwagLabsLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;



public class SwaLabsLoginStepsDefs {
    @Steps
    SwagLabsLoginSteps swagLabsLoginSteps;


    @Given("que me encuentro en la página de login de SwagLabs")
    public void queMeEncuentroEnLaPáginaDeLoginDeSwagLabs() {
        swagLabsLoginSteps.init();
    }

    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicioSesiónConLasCredencialesUsuarioYContraseña(String user, String password) {
        swagLabsLoginSteps.ingresarUser(user);
        swagLabsLoginSteps.ingresarContraseña(password);
        swagLabsLoginSteps.clicLogin();
    }

    @Then("valido que debería aparecer el título de {string}")
    public void validoQueDeberíaAparecerElTítuloDe(String expectedTitle) {
        Assert.assertEquals(swagLabsLoginSteps.getResultText(), expectedTitle);
    }

    @And("también valido que al menos exista un item")
    public void tambiénValidoQueAlMenosExistaUnItem() {
       swagLabsLoginSteps.itemsize();

    }
}
