package com.example.tests.domain;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static com.example.tests.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {

    @Autowired
    private PlanetService planetService;

    @MockBean
    private PlanetRepository planetRepository;
    @Test
    public void createPlanet_WithValiddate_ReturnsPlanet() {
        // AAA - Arrange, Act, Assert
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        // ACT
        Planet sut = planetService.create(PLANET);
        // ASSERT
        assertThat(sut).isEqualTo(PLANET);

    }

}
