package com.globalClasses;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

public class ApiTools {
	public String hostName = ApiPaths.METRICS_ENDPOINT;
	public ResponseEntity<String> response;
	public ResponseEntity<String> requestBody;
	public MediaType contentType = MediaType.APPLICATION_JSON;
	public RestTemplate restTemplate = new RestTemplate();
	public HttpHeaders headers = new HttpHeaders();
	public String stringCredentials;
	
//	public ApiTools(String service, String env) {
//		getCredentials();
//	}
	
	public ResponseEntity<String> retrieve(String apiPath) {
//		SSLCertificateValidation.disable();
		try {
//			headers.add("Authorization", null);
			headers.add("User-Agent", "cheese");
			headers.setContentType(contentType);
			
			restTemplate.setErrorHandler(new ResponseErrorHandler() {
				
				public boolean hasError(ClientHttpResponse response) throws IOException {
					return false;
				}
				
				public void handleError(ClientHttpResponse response) throws IOException {
				}
			});
			HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
			//System.out.println("\n\tRequestBody: " + requestBody );
			//System.out.println("\n\tFULL PATH " + hostName + "" + apiPath + "" + HttpMethod.GET + "" + requestEntity + "" + String.class);
			response = restTemplate.exchange(hostName + apiPath, HttpMethod.GET, requestEntity, String.class);
		} catch (HttpClientErrorException e) {
			System.out.println(e.getMessage());
			response = new ResponseEntity<String>(((HttpStatusCodeException) e).getResponseBodyAsString(),((HttpStatusCodeException) e).getStatusCode());
		}
		return response;
	}
	
	public ResponseEntity<String> POSTMethod(String apiPath, String requestBody) {
//		SSLCertificateValidation.disable();
		try {
//			headers.add("Authorization", null);
			//headers.add("User-Agent", "cheese");
			//headers.setContentType(contentType);

		    HttpHeaders headers = new HttpHeaders();
			headers.add("OUser-Agent", "User-Agent");
			headers.add("Content-Type", "application/json");

			restTemplate.setErrorHandler(new ResponseErrorHandler() {
				
				@Override
				public boolean hasError(ClientHttpResponse response) throws IOException {
					return false;
				}
				
				@Override
				public void handleError(ClientHttpResponse response) throws IOException {
				}
			});
			//HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(map, headers);
			HttpEntity<String> requestEntity = new HttpEntity<String>(requestBody, headers);
			//System.out.println("\n\tRequest body: " + requestBody );
			System.out.println("\n\tFULL PATH " + hostName + "" + apiPath + "" + HttpMethod.POST + "" + requestEntity + "" + String.class);
			//response = restTemplate.exchange(hostName + apiPath, HttpMethod.PUT, , String.class);
			response = restTemplate.exchange(hostName + apiPath, HttpMethod.POST, requestEntity, String.class);
			System.out.println("statuscode  "+response.getStatusCode()+"  body  "+ response.getBody()+" status code value "+response.getStatusCodeValue());
		} catch (HttpClientErrorException e) {
			System.out.println(e.getMessage());
			response = new ResponseEntity<String>(((HttpStatusCodeException) e).getResponseBodyAsString(),((HttpStatusCodeException) e).getStatusCode());
			
		}
		return response;
	}
	
	public ResponseEntity<String> PUTMethod(String apiPath, String requestBody) {
//		SSLCertificateValidation.disable();
		try {

		    HttpHeaders headers = new HttpHeaders();
		    //headers.add("Authorization", null);
			headers.add("OUser-Agent", "User-Agent");
			headers.add("Content-Type", "application/json");
			restTemplate.setErrorHandler(new ResponseErrorHandler() {
				
				public boolean hasError(ClientHttpResponse response) throws IOException {
					return false;
				}
				
				public void handleError(ClientHttpResponse response) throws IOException {
				}
			});
			
			//HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(map, headers);
			HttpEntity<String> requestEntity = new HttpEntity<String>(requestBody, headers);
			//System.out.println("--Request body " + requestBody );
			//System.out.println("\n\tFULL PATH " + hostName + "" + apiPath + "" + HttpMethod.PUT + "" + requestEntity + "" + String.class);
			response = restTemplate.exchange(hostName + apiPath, HttpMethod.PUT, requestEntity, String.class);
		} catch (HttpClientErrorException e) {
			System.out.println(e.getMessage());
			response = new ResponseEntity<String>(((HttpStatusCodeException) e).getResponseBodyAsString(),((HttpStatusCodeException) e).getStatusCode());
			
		}
		return response;
	}
	
	
	public ResponseEntity<String> POSTUSERS(String apiPath, String requestBody) {
//		SSLCertificateValidation.disable();
		try {
//			headers.add("Authorization", null);
			//headers.add("User-Agent", "cheese");
			//headers.setContentType(contentType);

		    HttpHeaders headers = new HttpHeaders();
			headers.add("OUser-Agent", "User-Agent");
			headers.add("Content-Type", "application/json");

			restTemplate.setErrorHandler(new ResponseErrorHandler() {
				
				@Override
				public boolean hasError(ClientHttpResponse response) throws IOException {
					return false;
				}
				
				@Override
				public void handleError(ClientHttpResponse response) throws IOException {
				}
			});
			
			hostName = ApiPaths.USERS_ENDPOINT;
			//HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(map, headers);
			HttpEntity<String> requestEntity = new HttpEntity<String>(requestBody, headers);
			//System.out.println("\n\tRequest body: " + requestBody );
			//System.out.println("\n\tFULL PATH " + hostName + "" + apiPath + "" + HttpMethod.POST + "" + requestEntity + "" + String.class);
			//response = restTemplate.exchange(hostName + apiPath, HttpMethod.PUT, , String.class);
			response = restTemplate.exchange(hostName + apiPath, HttpMethod.POST, requestEntity, String.class);
			//System.out.println("statuscode  "+response.getStatusCode()+"  body  "+ response.getBody()+" status code value "+response.getStatusCodeValue());
		} catch (HttpClientErrorException e) {
			System.out.println(e.getMessage());
			response = new ResponseEntity<String>(((HttpStatusCodeException) e).getResponseBodyAsString(),((HttpStatusCodeException) e).getStatusCode());
			
		}
		return response;
	}
	
	
}