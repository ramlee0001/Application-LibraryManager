package com.virtusa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.librarymanager.LibraryManager;

public interface LibraryRepo extends JpaRepository<LibraryManager, Integer> {
	public List<LibraryManager>findByGenre(String genre);
}
