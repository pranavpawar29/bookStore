package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        BookDto b1 = BookDto.builder().title("My first book").build();
        List<BookDto> list = new ArrayList<>();
        list.add(b1);
        return ResponseEntity.ok(list);
    }
}
