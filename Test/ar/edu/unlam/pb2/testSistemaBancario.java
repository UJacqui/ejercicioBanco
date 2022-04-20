package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testSistemaBancario {
	@Test
	public void queSePuedaAgergarUnaCuentaAlBanco(){

		String nombreBanco ="rio";
		Banco banco=new Banco(nombreBanco);
		
		Integer id =1;
		Double saldoInicial= 10000.0;
		Integer idCliente = 1;
		String nombre = "German";
		Cliente cliente = new Cliente(idCliente , nombre );
		
		Cuenta cuenta = new Cuenta(id , cliente , saldoInicial);
		banco.agregarCuenta(cuenta);
		Integer valorEsperado = 1;
		Integer valorObtenido = banco.obtenerCantDeCuentas();
		assertEquals(valorEsperado,valorObtenido);
	
		
	}
	@Test
	public void queSePuedaEncontrarUnaCuentaPorId(){

		String nombreBanco ="rio";
		Banco banco=new Banco(nombreBanco);
		
		Integer id =1;
		Double saldoInicial= 10000.0;
		Integer idCliente = 1;
		String nombre = "German";
		Cliente cliente = new Cliente(idCliente , nombre );
		
		Cuenta cuenta = new Cuenta(id , cliente , saldoInicial);
		Cuenta cuenta1 = new Cuenta(id , cliente , saldoInicial);
		banco.agregarCuenta(cuenta);
		Cuenta cuentaEncontrada = banco.bucarCuentaPorId(id);
		
		assertEquals(cuentaEncontrada,cuenta);
	
		
	}

}
