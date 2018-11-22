package com.example.demo.Restful;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Restful.DTO.NoteRepository;

public class BoardController{
	@Autowired
	private NoteRepository noteRepository;
}