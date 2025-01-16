package com.aluracursos.modelos;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    // metodo (Moneda = el tipo de retorno del metodo) ConsultarMoneda es el nombre del metodo
    // recibe 3 parametros 2 string y un double
    public Moneda ConvertirMoneda(String opcion, String opcion2, double cantidad){



        String direccion = "https://v6.exchangerate-api.com/v6/180df183595303b4b57b5bfc/pair/"+opcion+"/"+opcion2+"/"+cantidad;

        try {
        //hacer un request de http
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                // se adjunta la variable direccion creada a partir de la busqueda del usuario
                .uri(URI.create(direccion))
                .build();



        // tratar las excepciones es decir valores nulos, espacios y demas

            // una http response
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // se implementa el jar de Gson
            // retorna Gson de un Json con los siguientes parametros
            // (response.body() que seria la resuesta de la api
            // y pelicula.class que seria a la clase que queremos que se acople

            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda");
        }




    }

}
