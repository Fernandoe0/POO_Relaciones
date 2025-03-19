/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabancario;

/**
 *
 * @author BICHO
 */
public class CuentaBancaria {
    
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    
    public void depositar(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("su nuevo saldo es: " + saldo);
        }
        else{
            System.out.println("error en el depósito ingrese un valor mayor a cero");
        }
                
    }
 
  public void retirar(double monto){
      if (monto > 0 && monto <= saldo) {
          saldo -= monto;
          System.out.println(" Retiro exitoso su nuevo saldo es: " + saldo);
      }
      else  {
          System.out.println(" error en su transacción, verifique el monto y saldo disponible");
      }
  }
  
  public double consultarSaldo(){
      return saldo;
  }
  
  @Override
   public String toString(){
       return " CuentaBancaria " +
              " Número: " + numeroCuenta + "\n" +
              " Propietario: " + propietario.getNombre() + "\n" +
              " Saldo: " + saldo;
   }       
}