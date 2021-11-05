package com.example.sping_portfolio.controllers.WEBAPI;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Controller
public class APIcontroller {

    // GET request, no parameters
    @GetMapping("/news")
    public String News(Model model) throws IOException, InterruptedException, ParseException {
        //api setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://newsapi.org/v2/everything?q=fake_news&apiKey=b603393480fe4eb18674d4f003c35f2f"))
                .header("x-newsapihost", " https://newsapi.org/v2/articles")
                .header("x-api-key", "b603393480fe4eb18674d4f003c35f2f")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        //alternative #2: convert response.body() to JSON object
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

        System.out.println(jo.get("totalResults"));
        model.addAttribute("news", jo.get("articles"));

        return "project/News";
    }

    @GetMapping("/key")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String key(@RequestParam(name="keyword", required=false, defaultValue="business") String keyword, Model model) throws IOException, InterruptedException, ParseException {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://newsapi.org/v2/top-headlines?country=us&category="+keyword+"&apiKey=b603393480fe4eb18674d4f003c35f2f"))
                .header("x-newsapihost", " https://newsapi.org/v2/articles")
                .header("x-api-key", "b603393480fe4eb18674d4f003c35f2f")
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        //alternative #2: convert response.body() to JSON object
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

        System.out.println(jo.get("totalResults"));
        model.addAttribute("news", jo.get("articles"));
        model.addAttribute("keyword", keyword);

        return "project/newsKeyword"; // returns HTML VIEW (greeting)
    }
}
