package edu.sc.bse3211.meetingplanner;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {
    // Add test methods here.
    // You are not required to write tests for all classes.
    @Test
    public void testDefaultConstructor() {
        Person person = new Person();
        assertEquals("Name should be empty string for default constructor", "", person.getName());
        assertNotNull("Calendar object should be initialized", person.calendar);
    }

    @Test
    public void testNameConstructor() {
        Person person = new Person("John Doe");
        assertEquals("Name should be set correctly", "John Doe", person.getName());
        assertNotNull("Calendar object should be initialized", person.calendar);
    }

    @Test
    public void testAddMeeting_NoConflict() throws TimeConflictException {
        Person person = new Person();
        Meeting meeting = new Meeting(1, 15, 10, 12);
        person.addMeeting(meeting);
        assertTrue("Meeting should be added successfully", person.isBusy(1, 15, 10, 12));
    }

    @Test
    public void testPrintAgenda_Month() {
        Person person = new Person();
        String agenda = person.printAgenda(5); // Assuming printAgenda(int) calls Calendar
        // Assuming printAgenda(int, int) calls Calendar
        System.out.println(agenda);
    }

    @Test
    public void testIsBusy() throws TimeConflictException {
        Person person = new Person();
        Meeting meeting = new Meeting(1, 15, 10, 12);
        person.addMeeting(meeting);
        assertTrue("Person should be busy during meeting time", person.isBusy(1, 15, 10, 12));
    }

}
