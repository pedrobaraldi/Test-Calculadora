import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Calculadora.Calculadora;

public class CalculadoraTestDivisao extends Calculadora {

    @Test
    void testeSomar() {

        Calculadora calc = new Calculadora();

        int a = 5;
        int b = 2;
        int resultado = calc.dividir(a, b);

        assertEquals(a / b, resultado);
    }
}
