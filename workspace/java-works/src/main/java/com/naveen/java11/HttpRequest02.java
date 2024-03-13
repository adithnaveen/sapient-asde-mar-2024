package com.naveen.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpRequest02 {
    public static void main(String[] args) {
        String domain ="https://www.amazon.in/";
        var request = HttpRequest.newBuilder()
                .uri(URI.create(domain))
                .build();

        var client = HttpClient.newHttpClient();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse :: statusCode)
                .thenAccept(System.out :: println)
                .join();
    }
}

