package com.example.tests.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tests.domain.Planet;

@RestController
@RequestMapping("/planets")
public class PlanetController {
    

    @PostMapping
    public ResponseEntity<Planet> createPlanet() {
        return null;
    }

}
