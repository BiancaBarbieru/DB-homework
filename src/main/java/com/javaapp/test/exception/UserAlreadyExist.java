package com.javaapp.test.exception;

public class UserAlreadyExist extends Exception {
    public UserAlreadyExist(){
        super("User already exist!");
    }
}
