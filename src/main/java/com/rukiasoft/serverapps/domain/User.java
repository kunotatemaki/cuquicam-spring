package com.rukiasoft.serverapps.domain;

import java.io.Serializable;

public class User  implements Serializable {

private static final long serialVersionUID = -7492639752670189553L;
	
	private Integer idUser;
	
	private String name;
	
	private String password;
	
	private String idGcm;
	
	private String idDevice;
	
	private Boolean connected;

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIdGcm() {
		return idGcm;
	}

	public void setIdGcm(String idGcm) {
		this.idGcm = idGcm;
	}

	public String getIdDevice() {
		return idDevice;
	}

	public void setIdDevice(String idDevice) {
		this.idDevice = idDevice;
	}

	public Boolean getConnected() {
		return connected;
	}

	public void setConnected(Boolean connected) {
		this.connected = connected;
	}
	
	

}
