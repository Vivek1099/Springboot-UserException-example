package com.briz.mysequence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController
{
@Autowired
BookRepository bookrepo;
@RequestMapping("/test")
public String booktest()
{
	return "this is book test";
}
@RequestMapping("/save")
public String savedata()
{
	Book b=new Book();
	b.setAuthorname("manisha");
	b.setBookname("c++");
	b.setSubject("computer sc");
	bookrepo.save(b);
	return "book saved";
	
}
@RequestMapping("/all")
public List<Book> all()
{
	return bookrepo.findAll();
}
}
