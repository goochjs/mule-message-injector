package org.mule.transformers;

import org.goochjs.muleMessageInjector.RequestDetails;
import org.goochjs.muleMessageInjector.Response;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class GetResponse extends AbstractMessageTransformer {
    /**
     * @param args
     */
	private Response myResponse = new Response();
	private RequestDetails myRequest = new RequestDetails();
		
    public Response transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
    	
    	if ( message.getInboundProperty("http.method") != null ) {
    		myRequest.setMethod(message.getInboundProperty("http.method").toString());
    	} else {
    		myRequest.setMethod("UNKNOWN");
    	}
    	
    	try {
    		myRequest.setPayload(message.getPayloadAsString());
		} catch (Exception e) {
			myRequest.setPayload("UNKNOWN");
		}

    	if ( message.getInboundProperty("http.request.path") != null ) {
    		myRequest.setPath(message.getInboundProperty("http.request.path").toString());
    	} else {
    		myRequest.setPath("UNKNOWN");
    	}
    	
    	if ( message.getInboundProperty("http.query.params") != null ) {
    		myRequest.setQueryParams(message.getInboundProperty("http.query.params").toString());
    	} else {
    		myRequest.setQueryParams("UNKNOWN");
    	}
    	
    	myResponse.setMessage(myRequest);
    	
    	return myResponse;
    }
}
	