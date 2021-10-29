package com.example.sping_portfolio.controllers.WEBAPI;

import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;

import org.json.simple.JSONArray;
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
        // https://rapidapi.com/spamakashrajtech/api/corona-virus-world-and-india-data/
        //rapidapi setup:
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://tidalwaves-news-analytics2.p.rapidapi.com/stories/latest?withArticles=true"))
                .header("x-rapidapi-host", "tidalwaves-news-analytics2.p.rapidapi.com")
                .header("x-rapidapi-key", "42f28884f0msh2ee7d88bea53b8dp146d11jsn2587c1474f6f")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


        //alternative #1: convert response.body() to java hash map
        var map = new ObjectMapper().readValue(response.body(), HashMap.class);

        //alternative #2: convert response.body() to JSON object
        System.out.println(response.body());
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;

        System.out.println(jo.get("data"));
        model.addAttribute("news", jo.get("data"));
        //pass stats to view
//        model.addAttribute("map", map);
//        model.addAttribute("jo", jo);
//        model.addAttribute("world_map", map.get("world_total")); //illustrative of map get
//        model.addAttribute("world_jo", jo.get("world_total"));  //illustrative of jo get


        return "project/News";
    }

    @Controller  // HTTP requests are handled as a controller, using the @Controller annotation
    public class Key {
        @GetMapping("/key")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
        public String greeting(@RequestParam(name="keyword", required=false, defaultValue="apple") String keyword, Model model) throws IOException, InterruptedException, ParseException {
            // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://tidalwaves-news-analytics2.p.rapidapi.com/articles"))
                    .header("content-type", "application/json")
                    .header("x-rapidapi-host", "tidalwaves-news-analytics2.p.rapidapi.com")
                    .header("x-rapidapi-key", "42f28884f0msh2ee7d88bea53b8dp146d11jsn2587c1474f6f")
                    .method("POST", HttpRequest.BodyPublishers.ofString("{\n    \"keywords\": {\n        \"ids\": [\n            1,\n            2\n        ]\n    },\n    \"locations\": {\n        \"ids\": [\n            3\n        ]\n    },\n    \"title\": {\n        \"query\":" +keyword+"\"\n    }\n}"))
                    .build();
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            Object obj = new JSONParser().parse(response.body());
            JSONObject jo = (JSONObject) obj;
            model.addAttribute("news", jo.get("data")); // MODEL is passed to html
            return "project/newsKeyword"; // returns HTML VIEW (greeting)
        }
    }
}
