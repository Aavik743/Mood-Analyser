package com.bl.moodanalyser;

public class MoodAnalyser {

	String message;
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}
			else {
				return "HAPPY";
			}
		}
		catch (NullPointerException ex) {
			throw new MoodAnalysisException("Please enter proper message");
	
		}
	}

}
