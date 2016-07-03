package com.rukiasoft.serverapps.restservices;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rukiasoft.serverapps.logic.CuquiCamMethods;
import com.rukiasoft.serverapps.utils.CuquicamConstants;


@Path("cuquicam_server_secure")
public class CuquiCamRestfulSecure {
	

    private CuquiCamMethods methods;
    
    public CuquiCamMethods getMethods() {
		return methods;
	}

	public void setMethods(CuquiCamMethods methods) {
		this.methods = methods;
	}

	/*
     * Función que devuelve todos los usuarios
     *
     */
	@GET
    @Path("get_all_users/")    
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public Response get_all_users(){
		Integer error = CuquicamConstants.NO_ERROR;
		JsonObject response = new JsonObject();
		//CuquiCamMethods methods = new CuquiCamMethods();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
		methods = applicationContext.getBean("cuquiCamMethods", CuquiCamMethods.class);
	   
		response = methods.getAllUsers();
		if(response != null) {
			return Response.status(HttpURLConnection.HTTP_OK).entity(response.toString()).build();
		}else {
			return Response.status(HttpURLConnection.HTTP_NOT_FOUND).build();
		}
        
    }
	
	
	
}


