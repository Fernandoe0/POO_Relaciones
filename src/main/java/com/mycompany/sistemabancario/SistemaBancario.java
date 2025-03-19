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
        Cliente cliente1 = new Cliente("Juan Pérez","2082-97774-0403", "12 calle 4-04 san juan");
    cliente1.mostrarDatos();
    
    //String numeroCuenta, double saldo, Cliente propietario
    CuentaBancaria cuenta1 = new CuentaBancaria("027-004394-6",100.00,cliente1);
    
    System.out.println("saldo actual: " + cuenta1.consultarSaldo());
    cuenta1.depositar(1500);
    cuenta1.retirar(700);
    System.out.println("saldo final: " + cuenta1.consultarSaldo());
    }
    
}
