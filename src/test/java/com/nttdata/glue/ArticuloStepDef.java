package com.nttdata.glue;

// Importa la clase ArticuloStep, que contiene la lógica de negocio para realizar acciones específicas.
import com.nttdata.steps.ArticuloStep;

// Importa las anotaciones de Cucumber para definir los pasos de Given, When, Then.
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// Importa la anotación @Steps de Serenity para inyectar una instancia de la clase ArticuloStep.
import net.thucydides.core.annotations.Steps;

// Define la clase ArticuloStepDef, que contiene los métodos que implementan los pasos definidos en el archivo .feature.
public class ArticuloStepDef {

    // Inyecta automatica de la clase ArticuloStep para que se puedan llamar sus métodos desde esta clase.
    @Steps
    ArticuloStep articulo; // equivale a ArticuloStep articulo = new ArticuloStep();

    // Este método corresponde al paso Given en el archivo .feature.
    // Recibe como parámetro la URL del servicio y la pasa al método definirurl() de la clase ArticuloStep.
    @Given("la url {string} del servicio")
    public void laUrlDelServicio(String url) {
        // Llama al método definirurl() en ArticuloStep para configurar la URL del servicio.
        articulo.definirurl(url);
    }

    // Este método corresponde al paso When en el archivo .feature.
    // Llama al método consultaArtuculos() de la clase ArticuloStep para realizar la consulta.
    @When("hago la consulta de los articulos")
    public void hagoLaConsultaDeLosArticulos() {
        // Llama al método consultaArtuculos() en ArticuloStep para realizar la consulta de los artículos.
        articulo.consultaArtuculos();
    }

    // Este método corresponde al paso Then en el archivo .feature.
    // Llama al método imprimirArticulos() de la clase ArticuloStep para imprimir los resultados.
    @Then("imprimo los articulos")
    public void imprimoLosArticulos() {
        // Llama al método imprimirArticulos() en ArticuloStep para imprimir los artículos obtenidos.
        articulo.imprimirArticulos();
    }
}
