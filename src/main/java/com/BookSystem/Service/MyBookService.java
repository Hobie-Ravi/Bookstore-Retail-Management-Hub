package com.BookSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookSystem.Entity.MyBookList;
import com.BookSystem.Repository.MyBookRepository;

@Service
public class MyBookService {

	@Autowired
	private MyBookRepository myBookRepo;
	
	public void saveMyBooks(MyBookList book) {
		myBookRepo.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBookRepo.findAll();
	}
	
	public void deleteById(int id) {
		myBookRepo.deleteById(id);
	}
}
