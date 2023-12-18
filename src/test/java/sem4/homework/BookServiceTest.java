package sem4.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Mock
    private BookRepository bookRepository; //Создаем мок-объект

    private  BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        bookService = new BookService(bookRepository);
    }



    @Test
    void findBookById() {
        Book book = new Book("1", "Test", "Puschkin");

        when(bookRepository.findById("1")).thenReturn(book);

        Book result = bookService.findBookById("1");
        assertEquals(book, result);

        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    void findAllBooks() {
        List<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("2", "Test", "Puschkin"));
        bookList.add(new Book("3", "Test", "Puschkin"));

        when(bookService.findAllBooks()).thenReturn(bookList);

        List<Book> result = bookService.findAllBooks();
        assertEquals(2, result.size());


        verify(bookRepository, times(1)).findAll();



    }


}