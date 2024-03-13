package com.naveen.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpAPIRequest03 {
    private static String url="https://jsonplaceholder.typicode.com/posts/";
    private static String postsDataPayload ="{\n" +
            "  \"userId\": 1,\n" +
            "  \"id\": 1,\n" +
            "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
            "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
            "}";
    public static void main(String[] args) throws IOException, InterruptedException {

//       getCall();

        postCall();

    }

    private static void postCall() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2)
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(postsDataPayload))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        System.out.println(response.statusCode());


    }

    private static void getCall() throws IOException, InterruptedException {
        // to make get request
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder().version(HttpClient.Version.HTTP_2)
                .uri(URI.create(url))
                // request header decompresses based on client encoding
                .headers("Accept-Enconding", "gzip,deflate").build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String responseBody = response.body();
        int  statusCode = response.statusCode();

        System.out.println("HttpRequet response -> " + responseBody);
        System.out.println("Staus Code  -> " + statusCode);
    }
}
