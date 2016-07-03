package com.rukiasoft.serverapps.logic;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.rukiasoft.serverapps.domain.User;

public class CuquiCamMethods {

	private CuquiCamMethodsInternal methods;
	
	
	public CuquiCamMethodsInternal getMethods() {
		return methods;
	}


	public void setMethods(CuquiCamMethodsInternal methods) {
		this.methods = methods;
	}


	public JsonObject getAllUsers(){
		JsonObject oUsers = new JsonObject();
		List<User> users = methods.getAllUsers();
		JsonArray arrayUsers = new JsonArray();
		Gson gson = new Gson();
		for(User user : users) {
			arrayUsers.add(gson.toJson(user));
		}
		oUsers.add("users", arrayUsers);
		return oUsers;
	}
}
