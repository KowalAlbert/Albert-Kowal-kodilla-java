package com.kodilla.exceptiontwo.test;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(final String message) {
        super(message);
    }
}
