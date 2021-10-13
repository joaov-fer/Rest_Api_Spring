
package com.api.protheus.config;

public class Conexao {
	
	private String user;
	private String senha;
	private String banco;
	private String porta;
	private String ip;
	private String userAPI;
	private String senhaAPI;
	private String timeUpdateFiles;
	
	public String getTimeUpdateFiles() {
		return timeUpdateFiles;
	}
	public void setTimeUpdateFiles(String timeUpdateFiles) {
		this.timeUpdateFiles = timeUpdateFiles;
	}
	public String getUserAPI() {
		return userAPI;
	}
	public void setUserAPI(String userAPI) {
		this.userAPI = userAPI;
	}
	public String getSenhaAPI() {
		return senhaAPI;
	}
	public void setSenhaAPI(String senhaAPI) {
		this.senhaAPI = senhaAPI;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
