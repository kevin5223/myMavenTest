package com.edittw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/order") //���ѪA�Ȫ� URL
public class Order {
 
    @GET // �������n�D��k�G�i�H�O GET, POST, PUT, DELETE
    public String get() {
        return "Hello, Jersey";
    }
     
}
