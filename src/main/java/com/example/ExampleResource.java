package com.example;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
class HelloResource {
    @Route(path = "/hello", methods = HttpMethod.GET)
    public void handle(RoutingContext rc) {
        HttpServerResponse response = rc.response();
        response.putHeader("content-type", "text/plain;charset=UTF-8");
        response.end("hello");
    }
}