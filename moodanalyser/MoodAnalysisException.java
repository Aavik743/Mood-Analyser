package com.bl.moodanalyser;

public class MoodAnalysisException extends Exception {
	enum ExceptionType {
		ENTERED_NULL,WHEN_EMPTY;
	}
	ExceptionType type;
	public MoodAnalysisException(String message) {
		super(message);
		this.type = type;
	}
	
}
