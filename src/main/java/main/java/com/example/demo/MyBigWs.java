package main.java.com.example.demo; 
import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService(name = "Big", serviceName = "Big") 
public class MyBigWs {
    @WebMethod
    public Double kmToMiles(Double km) {
        return km * 0.621371;
    }
    public Double nodesToKm(Double nodes) {
        return nodes * 1.852;
    }
}
