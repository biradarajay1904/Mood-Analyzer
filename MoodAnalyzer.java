package com.mood;

public class MoodAnalyzer {
	   public enum MoodAnalyser{
	        NULL
	    }
	    String message;

		public  MoodAnalyzer(String message) {
	        this.message = message;
	    }

	    public String analyseMood () throws MoodAnalyserException {
	        try {
	            if (message.toLowerCase().contains("sad"))
	                return "SAD";
	            else
	                return "HAPPY";
	        }
	        catch (NullPointerException e){
	            throw new MoodAnalyserException(e.getMessage());

	        }
	    }
	}