package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import io.restassured.response.Response;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearUsuario {

    private static String CREATE_USER = "https://petstore.swagger.io/v2/user";

    @Step("Crear usuario {0} en PetStore") // Define un paso de Serenity BDD
    // con la descripción "Crear usuario {0} en PetStore", donde {0} se reemplazará
    // con el primer argumento del método crearUsuario,
    //  Serenity mostrará en el informe de prueba un paso que dice:
    //  "Crear usuario jperez en PetStore".

    // Método para crear un usuario
    public void crearUsuario(String username, String firstName, String lastName){
        // Enviar la solicitud POST para crear un usuario y almacenar la respuesta
        Response response = SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \""+username+"\",\n" +
                        "  \"firstName\": \""+firstName+"\",\n" +
                        "  \"lastName\": \""+lastName+"\",\n" +
                        "  \"email\": \"string\",\n" +
                        "  \"password\": \"string\",\n" +
                        "  \"phone\": \"string\",\n" +
                        "  \"userStatus\": 0\n" +
                        "}")
                .log().all()
                .post(CREATE_USER)
                .then()
                .log().all()
                .extract()
                .response(); // Extrae la respuesta para poder manipularla posteriormente

        // Imprime el JSON de la respuesta en la consola
        System.out.println("Respuesta del servidor:");
        System.out.println(response.asString());
    }

    // Método para validar el campo 'type' en la respuesta
    public void validarType(String type) {
        restAssuredThat(response -> response.body("'type'", equalTo(type)));
        System.out.println("Type: " + SerenityRest.lastResponse().body().path("type").toString());
        System.out.println(SerenityRest.lastResponse().print());
    }

    // Método para validar el código de respuesta
    public void validarCodigoRespuesta(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}