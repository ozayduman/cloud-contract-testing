package com.bookstore.bookstoreinventoryprovider;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class BaseContractTest {

    @BeforeEach
    void setUp() {
        var mockGetAvailableBookService = Mockito.mock(GetAvailableBookService.class);
        Mockito.when(mockGetAvailableBookService.getAvailableBookCount(1)).thenReturn(new GetAvailableBookResponse(4));
        RestAssuredMockMvc.standaloneSetup(new GetAvailableBookController(mockGetAvailableBookService));
    }
}
