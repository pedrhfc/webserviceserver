package main;

import javax.xml.ws.Endpoint;

import calc.CalculadoraServicosImp;

public class Calculadora {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Endpoint.publish("http://192.168.9.28:8000/calculadora", new CalculadoraServicosImp());

	}

}
