package com.mood;

public class MoodAnalyzer {

	String message;

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyser = new MoodAnalyzer();
		String happyMood = moodAnalyser.analyseMood();
		System.out.println("My mood is :" + happyMood);
		String sadMood = moodAnalyser.analyseMood();
		System.out.println("My Mood is :" + sadMood);
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public MoodAnalyzer() {
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (Exception e) {
			return "HAPPY";
		}
	}
}