package org.debugroom.sample.cloudformation.common.apinfra.interceptor;

import org.slf4j.MDC;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class MDCLoggingInterceptor implements ClientHttpRequestInterceptor {

    private static final String HEADER_HOST_NAME_KEY_NAME = "X-HostName";

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest,
            byte[] body, ClientHttpRequestExecution clientHttpRequestExecution)
            throws IOException {
        ClientHttpResponse clientHttpResponse =
                clientHttpRequestExecution.execute(httpRequest, body);

        HttpHeaders httpHeaders = clientHttpResponse.getHeaders();
        if(httpHeaders.containsKey(HEADER_HOST_NAME_KEY_NAME)){
            MDC.put(HEADER_HOST_NAME_KEY_NAME,
                    httpHeaders.getFirst(HEADER_HOST_NAME_KEY_NAME));
        }
        return clientHttpResponse;
    }

}
