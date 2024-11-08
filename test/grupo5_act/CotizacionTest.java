/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grupo5_act;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        ConversorDeMoneda conversor = new ConversorDeMoneda(1000);
        conversor.calcularCotizacion(0, 1000);
        
    }
}

