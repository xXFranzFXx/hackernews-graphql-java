package com.howtographql.hackernews;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class SigninResolver implements GraphQLResolver<SignInPayload> {
    public User user(SignInPayload payload) {
        return payload.getUser();
    }
}