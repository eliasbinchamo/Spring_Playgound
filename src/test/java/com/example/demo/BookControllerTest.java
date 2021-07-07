package com.example.demo;

import com.example.demo.controller.BookController;
import com.example.demo.models.Book;
import com.example.demo.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ExtendWith(MockitoExtension.class)
public class BookControllerTest {

    private BookController bookController;

    @Autowired
    MockMvc mvc;

    @Mock
    BookRepository bookRepository;

//    @Test
//    public void booksTest() throws Exception {
//        this.mvc.perform(get("/books").contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Books Endpoint"));
//    }
//
//    @Test
//    public void createBookTest() {
//
//        when(bookRepository.save(any(Book.class))).thenReturn( new Book("BookTitle0","Author0", 700, 150.00 ));
//
//        bookController = new BookController(bookRepository);
//        Book actual = bookController.createBook(new Book("BookTitle0","Author0", 700, 150.00 ));
//
//        assertThat(actual.getTitle()).isEqualTo("BookTitle0");
//        assertThat(actual.getAuthor()).isEqualTo("Author0");
//        assertThat(actual.getLength()).isEqualTo(700);
//        assertThat(actual.getPrice()).isEqualTo(150.00);
//
//    }
//
//    @Test
//    public void updateBookTest() {
//
//        when(bookRepository.findById("elias")).thenReturn(Optional.of(new Book("Original Title","Author0", 700, 150.00 )));
//
//        bookController = new BookController(bookRepository);
//        Optional<Book> original = bookController.getBook("elias");
//        Book actual = bookController.updateBook("elias",new Book("BookTitle0","Author0", 700, 150));
//
//
//        assertThat(actual.getTitle()).isEqualTo("BookTitle0");
//        assertThat(actual.getAuthor()).isEqualTo("Author0");
//        assertThat(actual.getLength()).isEqualTo(700);
//        assertThat(actual.getPrice()).isEqualTo(150.00);
//    }

//    @Test
//    public void readBookTest() {
//
//        when(bookRepository.find(any(Book.class))).thenReturn( new Book("BookTitle0","Author0", 700, 150.00 ));
//
//        bookController = new BookController(bookRepository);
//        Book actual = bookController.createBook(new Book("BookTitle0","Author0", 700, 150.00 ));
//
//        assertThat(actual.getTitle()).isEqualTo("BookTitle0");
//        assertThat(actual.getAuthor()).isEqualTo("Author0");
//        assertThat(actual.getLength()).isEqualTo(700);
//        assertThat(actual.getPrice()).isEqualTo(150.00);
//
//    }



}
