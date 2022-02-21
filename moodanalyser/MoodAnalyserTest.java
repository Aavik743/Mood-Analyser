package com.bl.moodanalyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	public void givenMood_IsHappy_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyser analyser = new MoodAnalyser("I am Sad");
		String mood = analyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyser analyser = new MoodAnalyser("I am Happy");
		String mood = analyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMood_IsHappy_ShouldReturnException() {
		MoodAnalyser analyser = new MoodAnalyser(null);
		String mood = null;
		String m = null;
		try {
			mood = analyser.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m = e.getMessage();
		}
		Assert.assertEquals("Please enter proper message", m);
	}

}
