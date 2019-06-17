package calc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService	
@SOAPBinding(style = Style.	RPC)
public interface CalculadoraServicos {
	@WebMethod
	float somar(float num1,float num2);
	@WebMethod
	float subtrair(float num1,float num2);
	@WebMethod
	String insertUser(String nome);
	@WebMethod
	boolean verifyUser(boolean state);
}
