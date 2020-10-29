package com.example.web.service;

import com.example.book.Book;
import com.example.book.BookService;
import com.example.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class HandingFindBookByUser {

    private UserService userService;

    private BookService bookService;

    public HandingFindBookByUser(UserService userService, BookService bookService) {
        this.userService = userService;
        this.bookService = bookService;
    }

    public Book findBookByUser(String username) {
        String userId = userService.findUserByName(username).getId();
        return bookService.findBookByUser(userId);
    }
}
