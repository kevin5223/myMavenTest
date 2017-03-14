package com.edittw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/order") //提供服務的 URL
public class Order {
 
    @GET // 對應的要求方法：可以是 GET, POST, PUT, DELETE
    public String get() {
        return "Hello, Jersey";
    }
     
}
