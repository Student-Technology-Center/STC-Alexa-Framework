package edu.wwu.center.studenttechnology.stc.alexa.framework.speechlet;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletException;

import edu.wwu.center.studenttechnology.stc.alexa.framework.intent.IntentBase;
import edu.wwu.center.studenttechnology.stc.alexa.framework.intent.IntentHandler;

public abstract class Speechlet implements com.amazon.speech.speechlet.Speechlet {
	private IntentHandler intentHandler;

	public Speechlet() {
		intentHandler = new IntentHandler();
	}

	protected void registerIntent(IntentBase intentBase) {
		intentHandler.addIntentHandler(intentBase);
	}

	protected SpeechletResponse update(Intent intent, Session session) {
		return intentHandler.update(intent, session);
	}

	public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
		System.out.println("onIntent requestID=" + request.getRequestId() + ", sessionId=" + session.getSessionId());

		// Gets the intent from the request
		Intent intent = request.getIntent();

		// If our intent is somehow null, we throw an error
		if (intent == null) {
			throw new SpeechletException("Invalid Intent");
		}

		return update(intent, session);
	}

	public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
		System.out.println(
				"onSessionStarted requestID=" + request.getRequestId() + ", sessionId=" + session.getSessionId());
	}

	public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {
		System.out
				.println("onSessionEnd requestID=" + request.getRequestId() + ", sessionId=" + session.getSessionId());
	}

	public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
		System.out.println(
				"onSessionLaunch requestID=" + request.getRequestId() + ", sessionId=" + session.getSessionId());
		return null;
	}
}
