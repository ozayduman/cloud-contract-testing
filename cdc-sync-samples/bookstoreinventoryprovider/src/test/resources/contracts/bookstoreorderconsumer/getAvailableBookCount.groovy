import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/get-available-book-count'
        body(
                bookId : 1
        )
        headers {
            contentType applicationJson()
        }
    }

    response {
        status(200)
        body(
                count : 4
        )
        headers {
            contentType applicationJson()
        }
    }
}