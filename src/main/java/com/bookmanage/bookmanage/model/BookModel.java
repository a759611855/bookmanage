package com.bookmanage.bookmanage.model;

import com.bookmanage.bookmanage.bean.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookModel {
  public List<Book> getBooks(BookSearch bookSearchCondition);
  public Boolean saveBook(Book book);
  public void updateBook(Book book);
}
