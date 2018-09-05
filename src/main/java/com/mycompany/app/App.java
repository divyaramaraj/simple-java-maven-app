package com.mycompany.app;

/**
 * Hello world!
 *auto update demooo
 *s3 buckect added to file
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
