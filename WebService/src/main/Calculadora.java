package main;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import calc.CalculadoraServicos;

public class Calculadora {
	public static void main(String[] args) {
		try {
			
			URL url = new URL("http://192.168.9.28:8000/calculadora?wsdl");
			QName qname = new QName("http://calc/","CalculadoraServicosImpService");
			Service ws = Service.create(url, qname);
			
			CalculadoraServicos calc = ws.getPort(CalculadoraServicos.class);
			
			System.out.println(calc.subtrair(10, 5));	
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
}
