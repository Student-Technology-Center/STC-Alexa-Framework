package edu.wwu.center.studenttechnology.stc.alexa.framework.intent;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.Session;

import edu.wwu.center.studenttechnology.stc.alexa.framework.speechlet.SpeechletResponse;

public abstract class IntentBase {
	/*
	 * Base class for all new intent handler classes to use
	 */

	// Intents need a name
	private String name;

	// The base constructor takes in a name
	public IntentBase(String name) {
		this.name = name;
	}

	// Method to get the name of the intent
	public String getName() {
		return name;
	}

	// Intents need the following methods

	public SpeechletResponse execute(Intent intent, Session session) {
		return null;
	}

	public SpeechletResponse handleYesResponse(Intent intent, Session session) {
		return null;
	}

	public SpeechletResponse handleNoResponse(Intent intent, Session session) {
		return null;
	}

	public SpeechletResponse handleNextIntent(Intent intent, Session session) {
		return null;
	}
}
