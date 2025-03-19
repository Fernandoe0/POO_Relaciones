/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemabancario;

/**
 *
 * @author BICHO
 */
public class SistemaBancario {

    public static void main(String[] args) {
        //String nombre, String dpi, String dirección
        Cliente cliente1 = new Cliente("Pedro Pistolas","2082-97774-0443", "12 calle 4-35 san juan");
        Cliente cliente2 = new Cliente("Pepe Le_pu","2082-91154-0110", "11 calle 4-09 san juan");
        Cliente cliente3 = new Cliente("Juan Jose","2082-96514-0101", "10 calle 4-42 san juan");
        Cliente cliente4 = new Cliente("Laura Leon","2082-88165-0109", "24 calle 4-04 san juan");

    
    //String numeroCuenta, double saldo, Cliente propietario
    CuentaBancaria cuenta1 = new CuentaBancaria("027-004394-6",100.00,cliente1);
    CuentaBancaria cuenta2 = new CuentaBancaria("032-458916-9",100.00,cliente2);
    CuentaBancaria cuenta3 = new CuentaBancaria("049-840548-2",100.00,cliente3);
    CuentaBancaria cuenta4 = new CuentaBancaria("156-618101-0",100.00,cliente4);
    
    Banco banco = new Banco("Banco Montreal");
    
    banco.agregarCuenta(cuenta1);
    banco.agregarCuenta(cuenta2);
    banco.agregarCuenta(cuenta3);
    banco.agregarCuenta(cuenta4);
    
    
   System.out.println("cuenta a realizar retiro: " + cuenta1);
    cuenta1.depositar(500);
        cuenta1.retirar(200);
   
   System.out.println("cuenta a realizar retiro: " + cuenta2);     
        cuenta2.depositar(1000);
        cuenta2.retirar(1200); // Intento fallido (fondos insuficientes)
   
        
   System.out.println("cuenta a realizar retiro: " + cuenta3);
        cuenta3.depositar(1500);
        cuenta3.retirar(500);

  
   System.out.println("cuenta a realizar retiro: " + cuenta4);     
        cuenta4.depositar(2000);
        cuenta4.retirar(1000);

        // Mostrar todas las cuentas
        banco.mostrarCuentas();
    
    }
    
}
