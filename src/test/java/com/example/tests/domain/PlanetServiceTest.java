package com.example.tests.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static com.example.tests.common.PlanetConstants.INVALID_PLANET;
import static com.example.tests.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

//@SpringBootTest(classes = PlanetService.class)
@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {

    @InjectMocks
    private PlanetService planetService;
    @Mock
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

    @Test
    public void createPlanet_WithInvalidData_ThrowsException() {
        when(planetRepository.save(INVALID_PLANET)).thenThrow(RuntimeException.class);
        assertThatThrownBy(()->planetService.create(INVALID_PLANET)).isInstanceOf(RuntimeException.class);

    }

}
