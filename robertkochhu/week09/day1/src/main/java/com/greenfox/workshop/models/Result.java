package com.greenfox.workshop.models;

public class Result {
    private int result;
    private String error;

    public Result(int result) {
        this.result = result;
    }

    public Result(int result, String error) {
        this.result = result;
        this.error = error;
    }

    public Result(String error) {
        this.error = error;
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
