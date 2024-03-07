package com.example.tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTeste {
    
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assertions.assertThat(calculator.sum(2, 2)).isEqualTo(4);
    }

}
