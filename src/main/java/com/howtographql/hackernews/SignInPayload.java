package com.howtographql.hackernews;

public class SignInPayload {
    private final String token;
    private final User user;
    public SignInPayload(String token, User user) {
        this.token = token;
        this.user = user;
    }
    public String getToken() {
        return token;
    }
    public User getUser() {
        return user;
    }
}