package com.zza;

import com.zza.dao.BookDao;
import com.zza.pojo.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springbootdemo2ApplicationTests {
    @Autowired
    private BookDao bookDao;

    @Test
    void testbookdao() {
        List<Book> all = bookDao.findAll();
        System.out.println(all);

    }

}
