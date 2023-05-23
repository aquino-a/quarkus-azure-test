package io.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingFunction {

    public String message(String message) {
        return message;
    }
}
