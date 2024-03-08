package com.gmail.voronovskyi.yaroslav.isg.jenkins.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private static final String HELLO_MESSAGE = "Hello from Jenkins";
    private final HelloController helloController = new HelloController();

    @Test
    void shouldReturnExpectedMessage() {
        assertEquals(HELLO_MESSAGE, helloController.getHelloMessage());
    }
}
