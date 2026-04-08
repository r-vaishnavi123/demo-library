package com.library.service.library_service.controller;


import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
public class BorrowController {
 
    private List<String> borrowedBooks = new ArrayList<>();
 
    @PostMapping("/borrow")
    public String borrowBook(@RequestBody String bookName) {
        borrowedBooks.add(bookName);
        return "Borrowed book: " + bookName;
    }
 
    @PostMapping("/return")
    public String returnBook(@RequestBody String bookName) {
        borrowedBooks.remove(bookName);
        return "Returned book: " + bookName;
    }
 
    @GetMapping("/borrow")
    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
}
 