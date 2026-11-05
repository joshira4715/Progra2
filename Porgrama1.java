package Porgrama1;
import java.util.Scanner;

	public class Porgrama1 {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el numero de cuenta:");
    
    int numero1 = sc.nextInt();
	sc.nextLine();
		        
	System.out.println("Ingrese el nombre del titular:");
		        
	String titular1 = sc.nextLine();

		        
	double saldo1;

		 do {
		     System.out.println("Ingrese el saldo inicial:");
		     saldo1 = sc.nextDouble();

		         if (saldo1 < 0) {
		         System.out.println("Error: El saldo no puede ser negativo.");
		         }

		  } while (saldo1 < 0);

		  CuentaBancaria cuenta1 = new CuentaBancaria(numero1, titular1, saldo1);

		      System.out.println("Ingrese el numero de cuenta:");
		      int numero2 = sc.nextInt();
		      sc.nextLine();

		      System.out.println("Ingrese el nombre del titular:");
		      String titular2 = sc.nextLine();

		      double saldo2;

		        do {
		            System.out.println("Ingrese el saldo inicial:");
		            saldo2 = sc.nextDouble();

		            if (saldo2 < 0) {
		                System.out.println("Error: El saldo no puede ser negativo.");
		            }

		        } while (saldo2 < 0);

		        CuentaBancaria cuenta2 = new CuentaBancaria(numero2, titular2, saldo2);

		        System.out.println("Deposito a primera cuenta");
		        
		        int deposito1 = sc.nextInt();

		        cuenta1.depositar(deposito1);
		        
		        System.out.println("Deposito a segunda cuenta");
		        
		        int deposito2 = sc.nextInt();
		        
		        cuenta2.depositar(deposito2);

		        
		        System.out.println("retiros");

		        boolean resultado1 = cuenta1.retirar(100);
		        boolean resultado2 = cuenta2.retirar(500);

		        System.out.println("Retiro cuenta 1: " + resultado1);
		        System.out.println("Retiro cuenta 2: " + resultado2);


	
		        System.out.println("Estado de cuenta:");

		        System.out.println("Titular: " + cuenta1.getTitular());
		        System.out.println("Saldo: " + cuenta1.getSaldo());

		        System.out.println("Titular: " + cuenta2.getTitular());
		        System.out.println("Saldo: " + cuenta2.getSaldo());


		        System.out.println("Total de cuentas creadas: "
		                + CuentaBancaria.getTotalCuentas());

		        sc.close();
		    }
		}
