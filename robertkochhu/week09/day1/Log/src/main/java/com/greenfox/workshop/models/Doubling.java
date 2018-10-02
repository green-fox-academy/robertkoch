package com.greenfox.workshop.models;

public class Doubling {
    private int received;
    private int result;

    public Doubling(String error) {
        this.error = "Please provide an input!";
    }

    private String error;

    public Doubling(int received, int result) {
        this.received = received;
        this.result = result;

    }


    public int getReceived() {
        return received;
    }

    public void setReceived(int received) {
        this.received = received;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}