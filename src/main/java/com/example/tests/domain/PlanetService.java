package com.example.tests.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlanetService {

    private PlanetRepository planetRepository;
    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }
    public Planet create(Planet planet) {
        return planetRepository.save(planet);
    }


    public Optional<Object> get(Long id) {
        return Optional.of(planetRepository.findById(id));
    }
}
