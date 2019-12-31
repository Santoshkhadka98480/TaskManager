package com.example.taskmanager.ServerResponse;

public class SignUpResponse {
    private String status;
    private String token;


    public SignUpResponse(String status, String token) {
        this.status = status;
        this.token = token;
    }
}
