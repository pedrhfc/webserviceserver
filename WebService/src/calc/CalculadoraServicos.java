/**
 * CalculadoraServicos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculadoraServicos")
public interface CalculadoraServicos extends java.rmi.Remote {
    public java.lang.String insertUser(java.lang.String arg0) throws java.rmi.RemoteException;
    public float subtrair(float arg0, float arg1) throws java.rmi.RemoteException;
    public float somar(float arg0, float arg1) throws java.rmi.RemoteException;
    public boolean verifyUser(boolean arg0) throws java.rmi.RemoteException;
}
