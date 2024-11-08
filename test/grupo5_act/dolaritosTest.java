package grupo5_act;

import grupo5_act.ConversorDeMoneda;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class dolaritosTest {
    private double cantidad;
    private double tasaDeCambio;
    private double resultadoEsperado;

    public dolaritosTest(double cantidad, double tasaDeCambio, double resultadoEsperado) {
        this.cantidad = cantidad;
        this.tasaDeCambio = tasaDeCambio;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            { 180000, 1.5, 270000 },
            { 120000, 0, 0 }, // para que surja un error habria que cambiar (12000, 0, 1)
            { 100000, -900, -90000000 },
        });
    }

    @Test
    public void testCotizarCero() {
        ConversorDeMoneda conversor = new ConversorDeMoneda(0);
        assertEquals(resultadoEsperado, conversor.convertirMoneda(cantidad, tasaDeCambio), 0.001);
    }
}
