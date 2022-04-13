package org.jhp.com.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HttpUtil {
 
    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * HttpClient Request GET
     * @param url
     * @return
     * @throws Exception
     */
    public String getRequest(String url) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        
        ResponseHandler<String> handler = new BasicResponseHandler();
        String body = handler.handleResponse(response);
        return body;
    }

    /**
     * HttpClient Request POST
     * @param url
     * @return
     * @throws Exception
     */
    public String postRequest(String url) throws Exception {
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);
        request.setHeader("Accept", "application/json");
        request.setHeader("Connection", "keep-alive");
        request.setHeader("Content-Type", "application/json");

        HttpResponse response = client.execute(request);
        ResponseHandler<String> handler = new BasicResponseHandler();
        String body = handler.handleResponse(response);
        return body;
    }
    
    public String getRequestOk() throws Exception {
        return null;
    }

    public String postRequestOk() throws Exception {
        return null;
    }
}
