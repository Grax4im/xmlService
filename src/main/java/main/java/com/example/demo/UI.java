package main.java.com.example.demo;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet("/go")
public class UI extends HttpServlet{
    
    @WebServiceRef(wsdlLocation = "http://localhost:9080/Big?wsdl")
    private Big_Service service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Big port = service.getBigPort();
        //converter de km/h para milhas
        System.out.println(port.kmToMiles(Double.parseDouble("5")));
        //converter de nós para km/h
        System.out.println(port.nodesToKm(Double.parseDouble("2")));
    }
}
