package calc;

import javax.jws.WebService;

@WebService(endpointInterface = "calc.CalculadoraServicos")
public class CalculadoraServicosImp implements CalculadoraServicos	{

	@Override
	public float somar(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public float subtrair(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public String insertUser(String nome) {
		// TODO Auto-generated method stub
		return nome;
	}

	@Override
	public boolean verifyUser(boolean state) {
		// TODO Auto-generated method stub
		return state;
	}

}
