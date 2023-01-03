import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {

    public final static String endPoint = "http://0.0.0.0:9191/";
    public static void main(String[] args) {
        Endpoint.publish(endPoint, new BanqueService());
        System.out.println("Web Service deployed in "+endPoint);
    }
}
