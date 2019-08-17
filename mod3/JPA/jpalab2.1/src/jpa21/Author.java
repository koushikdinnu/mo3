package jpa21;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Author {
	@Id
private int id;
private String name;
@OneToMany

private List<Book> book=new ArrayList<Book>();
public List<Book> getBook() {
	return book;
}
public void setBook(List<Book> book) {
	this.book = book;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Author [id=" + id + ", name=" + name + ", book=" + book + "]";
}
}
