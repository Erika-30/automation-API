package com.nttdata.steps;

// Importa las clases necesarias para manejar la respuesta de la API y el modelo Articulo
import com.nttdata.model.Articulo;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

// Define la clase ArticuloStep que contiene los métodos para interactuar con la API y procesar los datos
public class ArticuloStep {

    // Declara una variable estática para almacenar la URL del servicio
    private static String URL = null;
    // Declara una variable para almacenar la respuesta de la API
    Response response;

    // Método para definir la URL del servicio
    public void definirurl(String url){
        // Asigna la URL proporcionada a la variable estática URL
        URL = url;
    };

    // Método para realizar la consulta de artículos
    public void consultaArtuculos(){
        // Realiza una solicitud GET a la URL del servicio y almacena la respuesta
        response =
        given()
                .contentType("application/json") // Establece el tipo de contenido de la solicitud
                .log() // Habilita el registro de la solicitud
                .all() // Registra todos los detalles de la solicitud
                .get(URL+"/posts"); // Realiza la solicitud GET a la URL concatenada con "/posts"
               // .then()
                //.log()
                //.all()
                ;
    };

    // Método para imprimir los artículos obtenidos de la respuesta de la API
    public void imprimirArticulos() {
        // Convierte la respuesta JSON en una lista de objetos Articulo
        List<Articulo> articulos = response.jsonPath().getList("", Articulo.class);
        // Imprime el número total de artículos obtenidos
        System.out.println("Total: "+articulos.size());
        // Itera sobre la lista de artículos y los imprime
        for(Articulo articulo:articulos){
            System.out.println("Titulo: "+ articulo.getId() + " - " +articulo.getTitle());
        }
    }
}