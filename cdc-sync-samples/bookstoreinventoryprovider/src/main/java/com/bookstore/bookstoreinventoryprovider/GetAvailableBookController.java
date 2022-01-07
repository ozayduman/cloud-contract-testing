package com.bookstore.bookstoreinventoryprovider;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAvailableBookController {
   private final GetAvailableBookService getAvailableBookService;

    public GetAvailableBookController(GetAvailableBookService getAvailableBookService) {
        this.getAvailableBookService = getAvailableBookService;
    }
    @PostMapping("/get-available-book-count")
    public GetAvailableBookResponse getAvailableBookCount(@RequestBody GetAvailableBookRequest getAvailableBookRequest){
        return getAvailableBookService.getAvailableBookCount(getAvailableBookRequest.getBookId());
    }
}
