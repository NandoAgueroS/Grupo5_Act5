/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5_act;

/**
 *
 * @author Lenovo
 */
public class ConversorDeMoneda {
    private double saldo;

    public ConversorDeMoneda(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public double convertirMoneda(double cantidad, double tasaDecambio)
    {
        return cantidad * tasaDecambio;
    }
    
    public double calcularCotizacion(double cantidadDivisa, double montoPesos)
    {
        if (cantidadDivisa == 0)
        {
            throw new ArithmeticException("La cantidad de divisa no puede ser cero.");
        }
        return montoPesos / cantidadDivisa;
    }
    public double aumentarSaldo(double monto)
    {
        this.saldo += monto;
        return this.saldo;
    }
    
    public double retirarDolares(double montoARetirar)
    {
        
        if (montoARetirar > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        
        for (int i = 1; i <= (montoARetirar/100); i++) 
        {
        
            this.saldo -= 100;
            
            System.out.println( (i) + " billetes de 100$ retirado " );  
        }
        
        return this.saldo;
        
    }
}
