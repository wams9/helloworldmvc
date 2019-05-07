package org.helloworldmvc.model;

public class DAOHelloWorld {
	private String FileName = test.txt;
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {
		
	}

	public DAOHelloWorld getInstance() {
		return instance;
	}

	public void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	
	private void readFile() {
		
	}

}
