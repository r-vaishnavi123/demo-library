package com.library.service.library_service.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/books")
public class BookController {
 
    private List<String> books = new ArrayList<>();
 //uhdjhdu
    @PostMapping
    public String addBook(@RequestBody String bookName) {
        books.add(bookName);
        return "Book added: " + bookName;
    }
 
    @GetMapping
    public List<String> getBooks() {
        return books;
    }
 
    @GetMapping("/{id}")
    public String getBookById(@PathVariable int id) {
        if (id < books.size()) {
            return books.get(id);
        }
        return "Book not found";
    }
}