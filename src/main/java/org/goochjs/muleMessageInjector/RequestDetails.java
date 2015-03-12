package org.goochjs.muleMessageInjector;

public class RequestDetails {
   	private String method;
   	private String path;
   	private String payload;
   	private String queryParams;

 	public String getMethod(){
		return this.method;
	}
	public void setMethod(String method){
		this.method = method;
	}
 	public String getPath(){
		return this.path;
	}
	public void setPath(String path){
		this.path = path;
	}
 	public String getPayload(){
		return this.payload;
	}
	public void setPayload(String payload){
		this.payload = payload;
	}
 	public String getQueryParams(){
		return this.queryParams;
	}
	public void setQueryParams(String queryParams){
		this.queryParams = queryParams;
	}
}
