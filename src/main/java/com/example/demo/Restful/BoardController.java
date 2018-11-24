package com.example.demo.Restful;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Restful.DTO.NoteRepository;
import com.example.demo.Restful.DTO.BoardRepository;

public class BoardController{
	@Autowired
	private NoteRepository noteRepository;
	private BoardRepository boardRepositroy;
	public NoteRepository getNoteRepository() {
		return noteRepository;
	}
	public void setNoteRepository(NoteRepository noteRepository) {
		this.noteRepository = noteRepository;
	}
	public BoardRepository getBoardRepositroy() {
		return boardRepositroy;
	}
	public void setBoardRepositroy(BoardRepository boardRepositroy) {
		this.boardRepositroy = boardRepositroy;
	}
	
}