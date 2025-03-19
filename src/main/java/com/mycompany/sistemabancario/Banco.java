/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author BICHO
 */
class Banco {
    private String nombre;
    private CuentaBancaria[] listaCuentas;
    private int contadorCuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaCuentas = new CuentaBancaria[10];
        this.contadorCuentas = 0;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        if (contadorCuentas < listaCuentas.length) {
            listaCuentas[contadorCuentas] = cuenta;
            contadorCuentas++;
            System.out.println("Cuenta agregada: " + cuenta.getNumeroCuenta());
        } else {
            System.out.println("Error: No se pueden agregar más cuentas. Banco lleno.");
        }
    }

    public void mostrarCuentas() {
        System.out.println("Cuentas en el banco " + nombre + ":");
        for (int i = 0; i < contadorCuentas; i++) {
            System.out.println("Número de cuenta: " + listaCuentas[i].getNumeroCuenta() +
                    ", Propietario: " + listaCuentas[i].getPropietario().getNombre() +
                    ", Saldo: " + listaCuentas[i].consultarSaldo());
        }
    }
}
