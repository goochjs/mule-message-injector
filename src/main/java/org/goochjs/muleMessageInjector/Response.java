package org.goochjs.muleMessageInjector;

public class Response {
   	private RequestDetails message;

 	public RequestDetails getMessage(){
		return this.message;
	}
	public void setMessage(RequestDetails message){
		this.message = message;
	}
}
