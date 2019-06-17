package calc;

public class CalculadoraServicosProxy implements calc.CalculadoraServicos {
  private String _endpoint = null;
  private calc.CalculadoraServicos calculadoraServicos = null;
  
  public CalculadoraServicosProxy() {
    _initCalculadoraServicosProxy();
  }
  
  public CalculadoraServicosProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServicosProxy();
  }
  
  private void _initCalculadoraServicosProxy() {
    try {
      calculadoraServicos = (new calc.CalculadoraServicosImpServiceLocator()).getCalculadoraServicosImpPort();
      if (calculadoraServicos != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraServicos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraServicos)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraServicos != null)
      ((javax.xml.rpc.Stub)calculadoraServicos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public calc.CalculadoraServicos getCalculadoraServicos() {
    if (calculadoraServicos == null)
      _initCalculadoraServicosProxy();
    return calculadoraServicos;
  }
  
  public java.lang.String insertUser(java.lang.String arg0) throws java.rmi.RemoteException{
    if (calculadoraServicos == null)
      _initCalculadoraServicosProxy();
    return calculadoraServicos.insertUser(arg0);
  }
  
  public float subtrair(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServicos == null)
      _initCalculadoraServicosProxy();
    return calculadoraServicos.subtrair(arg0, arg1);
  }
  
  public float somar(float arg0, float arg1) throws java.rmi.RemoteException{
    if (calculadoraServicos == null)
      _initCalculadoraServicosProxy();
    return calculadoraServicos.somar(arg0, arg1);
  }
  
  public boolean verifyUser(boolean arg0) throws java.rmi.RemoteException{
    if (calculadoraServicos == null)
      _initCalculadoraServicosProxy();
    return calculadoraServicos.verifyUser(arg0);
  }
  
  
}