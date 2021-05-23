package com.virtusa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.dao.LibraryRepo;
import com.virtusa.librarymanager.LibraryManager;

@Controller
public class LibraryController {

	@Autowired
	LibraryRepo repo;

	@RequestMapping("home")
	public String home() {
		return ("home.jsp");
	}

	@RequestMapping("savebook")
	public String savebook(LibraryManager lm) {
		repo.save(lm);
		System.out.println(lm);
		return ("home.jsp");
	}

	@RequestMapping("updatebook")
	public String savebook(@RequestParam("bookId") int bookId, LibraryManager lm) {
		if (repo.existsById(bookId)) {
			repo.save(lm);
		}
		System.out.println(lm);
		return ("home.jsp");
	}

	@RequestMapping("deletebook")
	public String deletebook(@RequestParam("bookId") int bookId, LibraryManager lm) {
		if (repo.existsById(bookId)) {
			repo.delete(lm);
		}
		System.out.println(lm);
		return ("home.jsp");
	}

	@RequestMapping("getallbooks")
	@ResponseBody
	public String deletebook() {
		return (repo.findAll().toString());
	}

	@RequestMapping("getbooksbygenre")
	@ResponseBody
	public String getbooksbygenre(@RequestParam("genre") String genre) {
		return (repo.findByGenre(genre).toString());
	}

}
