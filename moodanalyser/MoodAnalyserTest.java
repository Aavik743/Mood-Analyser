package com.bl.moodanalyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	public void givenMood_IsHappy_ShouldReturnSad() {
		MoodAnalyser analyser = new MoodAnalyser("I am Sad");
		String mood = analyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() {
		MoodAnalyser analyser = new MoodAnalyser("I am Happy");
		String mood = analyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}
	@Test
	public void givenMood_IsHappy_ShouldReturnException() {
		MoodAnalyser analyser = new MoodAnalyser(null);
		String mood = analyser.analyseMood();
		Assert.assertEquals("HAPPY",mood);
	}

}
