package com.nttdata;

// Importa las clases necesarias de Cucumber y Serenity
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// Anotación para indicar que esta clase debe ejecutarse con el runner de Serenity
@RunWith(CucumberWithSerenity.class)
// Configuración de Cucumber para especificar la ubicación de las características y el pegamento
@CucumberOptions(
        features = "src/test/resources/features", // Ruta a los archivos .feature
        glue = "com.nttdata.glue", // Paquete donde se encuentran las definiciones de los pasos
        plugin = {"pretty"} // Plugin para formatear la salida de la consola
)
// Definición de la clase de prueba CucumberTestSuite
public class CucumberTestSuite {
    // Clase vacía, la configuración se realiza a través de las anotaciones
}