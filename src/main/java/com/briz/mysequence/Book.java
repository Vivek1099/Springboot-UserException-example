package com.briz.mysequence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity(name="book")
public class Book 
{
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="book_generator")
@SequenceGenerator(name="book_generator",initialValue=12345,allocationSize=1,sequenceName="book_gen_seq")
int id;
String bookname;
String authorname;
String subject;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
}
