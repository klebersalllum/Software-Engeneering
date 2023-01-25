import java.util.*;

public class CyberCafe {
    // fields for storing information about the cafe
    private String name;
    private ArrayList<Computer> computers;
    private ArrayList<Person> users;
    private ArrayList<Session> sessions;

    // constructor
    public CyberCafe(String name) {
        this.name = name;
        this.computers = new ArrayList<Computer>();
        this.users = new ArrayList<Person>();
        this.sessions = new ArrayList<Session>();
    }

    // methods for adding and removing computers, users, and sessions
    public void addComputer(Computer computer) {
        this.computers.add(computer);
    }
    public void removeComputer(Computer computer) {
        this.computers.remove(computer);
    }
    public void addUser(Person user) {
        this.users.add(user);
    }
    public void removeUser(Person user) {
        this.users.remove(user);
    }
    public void addSession(Session session) {
        this.sessions.add(session);
    }
    public void removeSession(Session session) {
        this.sessions.remove(session);
    }

    // methods for checking availability of computers, logging in and out of sessions, and billing
    public boolean checkComputerAvailability(Computer computer) {
        // check if the computer is available for a new session
    }
    public boolean login(Person user, Computer computer) {
        // start a new session for the user on the computer
    }
    public boolean logout(Session session) {
        // end the session and calculate the bill
    }
    public double bill(Session session) {
        // calculate the bill for the session
    }
}