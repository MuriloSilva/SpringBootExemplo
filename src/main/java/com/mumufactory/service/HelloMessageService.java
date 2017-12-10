package com.mumufactory.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloMessageService {

    @Value("${name:vazio}")
    private String name;
    
    @Value("${argumentTwo:Parametro dois}")
    private String parametro;

    public String getMessage() {
        return "[1] Name:" + name + " Parameter:" + parametro;
    }

    public String getMessage(String name) {
        return "[2] Name:" + this.name + " Parameter:" + parametro + " LocalVariableName: " + name;
    }

}