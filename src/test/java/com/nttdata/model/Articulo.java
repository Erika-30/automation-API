package com.nttdata.model; // Define el paquete donde se encuentra la clase

import com.fasterxml.jackson.annotation.JsonPropertyOrder; // Importa la anotación para ordenar las propiedades JSON

@JsonPropertyOrder({"userId", "id", "title", "body" }) // Anotación para especificar el orden de las propiedades en el JSON
public class Articulo { // Define la clase Articulo
    private int userId; // Declara la propiedad userId de tipo int
    private String id; // Declara la propiedad id de tipo String
    private String title; // Declara la propiedad title de tipo String
    private String body; // Declara la propiedad body de tipo String

    // Método getter para la propiedad userId
    public int getUserId() {
        return userId;
    }

    // Método setter para la propiedad userId
    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Método getter para la propiedad id
    public String getId() {
        return id;
    }

    // Método setter para la propiedad id
    public void setId(String id) {
        this.id = id;
    }

    // Método getter para la propiedad title
    public String getTitle() {
        return title;
    }

    // Método setter para la propiedad title
    public void setTitle(String title) {
        this.title = title;
    }

    // Método getter para la propiedad body
    public String getBody() {
        return body;
    }

    // Método setter para la propiedad body
    public void setBody(String body) {
        this.body = body;
    }
}