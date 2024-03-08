package com.example.tests.domain;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static com.example.tests.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    @Test
    public void createPlanet_WithValiddate_ReturnsPlanet() {
        // system under test
        Planet sut = planetService.create(PLANET);
        assertThat(sut).isEqualTo(PLANET);

    }

}
