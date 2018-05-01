package uk.co.andymccall.docker.model;

public class Ping {

    private String response="pong";

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "Ping{" +
                "response=" + response +
                '}';
    }

}