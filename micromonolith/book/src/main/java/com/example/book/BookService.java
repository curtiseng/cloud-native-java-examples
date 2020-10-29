package com.example.book;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book findBookByUser(String userId) {
        if (userId.equals("0")) {
            return new Book("傅雷家书");
        } else {
            return new Book("海底三万里");
        }
    }

}
