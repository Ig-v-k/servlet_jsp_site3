package controller.listeners;

import controller.session.SessionRegistry;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebListener
public class SessionListenerServlet implements HttpSessionIdListener, HttpSessionListener {

    private SimpleDateFormat formatter = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");

    @Override
    public void sessionIdChanged(HttpSessionEvent a, String b) {
        System.out.println(this.date() + ": Session ID " + b + " changed to " + a.getSession().getId());
        SessionRegistry.updateSessionId(a.getSession(), b);
    }

    @Override
    public void sessionCreated(HttpSessionEvent a) {
        System.out.println(this.date() + ": Session " + a.getSession().getId() + " created.");
        SessionRegistry.addSession(a.getSession());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent a) {

    }

    private String date()
    {
        return this.formatter.format(new Date());
    }
}
