package edu.wwu.center.studenttechnology.stc.alexa.framework.util;

import com.amazon.speech.speechlet.Session;

public class SessionUtil {
    /*
     * This class is used to keep track of our attributes, since Session stores
     * them as Strings, we want to make sure it's not mistyped anywhere.
     */

    private static final String YES_NO_INTENT_ATTRIBUTE_NAME = "NEXT_YES_NO_INTENT";
    private static final String NEXT_EVENT_ATTRIBUTE_NAME = "NEXT_EVENT_INTENT";

    public static void setIntentToHandleNextYesNo(Session session,
            String intentName) {
        session.setAttribute(YES_NO_INTENT_ATTRIBUTE_NAME, intentName);
    }

    public static final String returnIntentToHandleNextYesNo(Session session) {
        return (String) session.getAttribute(YES_NO_INTENT_ATTRIBUTE_NAME);
    }

    public static final void setAttributesToNull(Session session) {
        session.setAttribute(YES_NO_INTENT_ATTRIBUTE_NAME, null);
        session.setAttribute(NEXT_EVENT_ATTRIBUTE_NAME, null);
    }

    public static final void setIntentToHandleNextEvent(Session session,
            String intentName) {
        session.setAttribute(NEXT_EVENT_ATTRIBUTE_NAME, intentName);
    }

    public static final String returnIntentToHandleNextEvent(Session session) {
        return (String) session.getAttribute(NEXT_EVENT_ATTRIBUTE_NAME);
    }
}
