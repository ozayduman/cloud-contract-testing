package com.bookstore.bookstoreorderconsumer;

import com.bookstore.bookstoreorderconsumer.BuyBookResponse.Status;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookStoreOrderController {
    private final RestTemplate restTemplate;

    public BookStoreOrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/order-book")
    public BuyBookResponse orderBook(@RequestBody BuyBookRequest buyBookRequest){
        final var availableBookResponse = restTemplate.postForObject("http://localhost:8080/get-available-book-count",
                new GetAvailableBookRequest(buyBookRequest.getBookId()),
                GetAvailableBookResponse.class);
        final var status = availableBookResponse.getCount() > 0
                ? Status.ACCEPTED
                : Status.REJECTED;
        return new BuyBookResponse(status);
    }
}
