/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grupo5_act;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Lenovo
 */
public class ConversorTest {
    
    private static ConversorDeMoneda instancia;

    public ConversorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("Bienvenido a la prueba de Conversor de Moneda");
        instancia = new ConversorDeMoneda(500);
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        System.out.println("La operación ha finalizado");
    }
    
    @Before
    public void setUp() 
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() 
    {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @Test
    public void testConvertirMoneda() 
    {
       Assert.assertEquals(1200000, instancia.convertirMoneda(1000, 1200), 0.001);
    }
    
    @Test
    public void testCalcularCotizacion() 
    {
       Assert.assertEquals(1111.111, instancia.calcularCotizacion(1620, 1800000), 0.001);
    }

    @Test
    public void testAumentarSaldo() 
    {
        Assert.assertEquals(2100, instancia.aumentarSaldo(1600) , 0.001);
    }

    /**
     * Test of retirarDolares method, of class ConversorDeMoneda.
     */
    @Test
    public void testRetirarDolares() 
    {
        Assert.assertEquals(0, instancia.retirarDolares(2100), 0.001);   
    }
    
}
