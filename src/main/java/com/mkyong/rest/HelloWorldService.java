/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;

import java.util.Random;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	
        
         @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String NumeroAleatorio() {
            Random numeroAleatorio=new Random(1000000000);
            int numero;
            numero =(numeroAleatorio.nextInt(100000000));
            for(int i=0; i>=numero; i++)
            {
                System.out.println("La iteracion es:" +i);
            }
            
            return "El número final es:" + numero;
        }
        
       

}