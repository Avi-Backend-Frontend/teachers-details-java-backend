package com.batch.coustomException;

public class TeacherNotFoundException extends RuntimeException {
	
	public TeacherNotFoundException(int teacherId) {
		super("Could not found the Teacher with id "+teacherId);
	}

}
