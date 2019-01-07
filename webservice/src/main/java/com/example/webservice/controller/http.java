package com.example.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.awt.*;

public class http {

    public static void main(String[] args){

        RestTemplate restTemplate=new RestTemplate();
 //  httpPost httpPost=new httpPost();
 //  httpPost.httpURLConnectionPOST("zhangmingyu");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://localhost:8081/httppost","zhangmingyu",String.class);
        System.out.println(responseEntity.getBody());

    }
}
