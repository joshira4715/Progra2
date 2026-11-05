package Porgrama1;
import java.util.Scanner;
public class CuentaBancaria {
	
	int numeroCuenta;
	String titular;
	double saldo;
	static String nombreBanco;
	static int totalCuentas;
		
	public CuentaBancaria(int numeroCuenta, String titular, double saldo) {
		    this.numeroCuenta = numeroCuenta;
		    this.titular = titular;
		    this.saldo = saldo;

		    totalCuentas++;
		}
	
	public void depositar(double monto) {
		Scanner sc = new Scanner(System.in);
	    do {

	        if (monto <= 0) {
	            System.out.println("El monto no es valido.");
	            System.out.println("Ingrese nuevamente el monto a depositar:");
	            monto = sc.nextDouble();
	        }

	    } while (monto <= 0);

	    double bonificacion = 0;

	    if (monto >= 500) {
	        bonificacion = 10;
	    }

	    saldo = saldo + monto + bonificacion;

	    System.out.println("Deposito realizado correctamente.");
	    System.out.println("Bonificacion: " + bonificacion);
	    System.out.println("Nuevo saldo: " + saldo);
	}
	
	public boolean retirar(double monto) {

	    double comision = 1.50;

	    if (monto > 0 && saldo >= monto + comision) {

	        saldo = saldo - monto - comision;

	        System.out.println("Retiro realizado correctamente.");
	        return true;

	    } else {

	        System.out.println("Fondos insuficientes o monto invalido.");
	        return false;
	    }
	}
	
	public static int getTotalCuentas() {

	    return totalCuentas;

	}
	
	public String getTitular() {
	    return titular;
	}

	public double getSaldo() {
	    return saldo;
	}
	

}
