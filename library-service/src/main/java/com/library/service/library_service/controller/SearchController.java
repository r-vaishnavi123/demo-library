package com.library.service.library_service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

private List<String> books = new ArrayList<>(List.of(
"Spring Boot",
"Java Basics",
"Microservices",
"GitHub Learning"
));

@GetMapping("/books/{title}")
public String searchBook(@PathVariable String title) {
for (String book : books) {
if (book.equalsIgnoreCase(title)) {
return "Book found: " + book;
}
}
return "Book not found";
}
}
