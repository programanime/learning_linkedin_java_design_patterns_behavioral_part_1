public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  public void handleRequest(String requestType) {
    if(requestType.equals("client certificate")) {
      System.out.println("Handling client certificate authentication request");
    } else {
      super.handleRequest(requestType);
    }
  }

}
