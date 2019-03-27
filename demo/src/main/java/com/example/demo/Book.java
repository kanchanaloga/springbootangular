package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
	public Book(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book []";
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
}
