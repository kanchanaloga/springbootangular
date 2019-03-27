package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)

@RestController
@RequestMapping("/api")
public class bookcontroller {
	
	@Autowired
	bookdaoimpl ba;
	
	//@Autowired
	
	List<Book>  lb = new ArrayList<>();
	
	@GetMapping("/")
	public String Home()
	{
		return "home";
	}
	
	@PostMapping("/saveBook")
	public Book createBook(@Valid @RequestBody Book bo) {
		Book s = new Book();

		//System.out.println(bo);
		s.setId(bo.getId());
		s.setPrice(bo.getPrice());
		//s=ba.save(s);
		lb.add(bo);
	    return s;
	}
	
	@GetMapping("/Book")
	public List<Book> getAllNotes() {
		
		
	    return lb;
	    
	    
	}

	@PutMapping("/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable int id) 
	{
		int  count=0;
		
	for(Book ch:lb)
	{count ++;
		if(ch.getId()==id)
		{
		
			lb.remove(count-1);
			lb.add(count-1,book);
		}
	}}
	
	@DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
		int count=0;
		for(Book ch:lb)
		{count ++;
			if(ch.getId()==id)
			{
			
				lb.remove(count-1);
			}       
	}
	
	
	
	
}
}