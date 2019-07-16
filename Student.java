package com.mkyong.java8;

import java.util.HashSet;
import java.util.Set;

public class Student {

    @SuppressWarnings("unused")
	private String name;
    private Set<String> book;

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }
    //getters and setters

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public Object getBook() {
		// TODO Auto-generated method stub
		return null;
	}

}
