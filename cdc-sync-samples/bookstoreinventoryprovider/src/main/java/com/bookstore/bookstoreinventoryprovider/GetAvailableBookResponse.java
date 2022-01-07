package com.bookstore.bookstoreinventoryprovider;

public class GetAvailableBookResponse {
    private int count;

    public GetAvailableBookResponse() {
    }

    public GetAvailableBookResponse(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
