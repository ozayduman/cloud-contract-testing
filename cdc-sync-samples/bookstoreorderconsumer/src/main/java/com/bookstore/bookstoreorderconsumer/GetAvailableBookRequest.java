package com.bookstore.bookstoreorderconsumer;

public class GetAvailableBookRequest {
    private final int bookId;

    public GetAvailableBookRequest(int bookId) {
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }
}
