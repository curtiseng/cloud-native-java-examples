package com.example.web.rest;

import com.example.book.Book;
import com.example.web.service.HandingFindBookByUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BookController {

    private HandingFindBookByUser handingFindBookByUser;

    public BookController(HandingFindBookByUser handingFindBookByUser) {
        this.handingFindBookByUser = handingFindBookByUser;
    }

    @GetMapping("/book")
    public ResponseEntity<Book> getBook() {
        return ResponseEntity.ok(handingFindBookByUser.findBookByUser("user"));
    }
}
