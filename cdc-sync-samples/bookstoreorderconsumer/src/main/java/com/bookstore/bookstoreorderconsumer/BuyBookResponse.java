package com.bookstore.bookstoreorderconsumer;

public class BuyBookResponse {
    private Status status;

    public BuyBookResponse(Status status) {
        this.status = status;
    }

    public enum Status {
        ACCEPTED,REJECTED
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
