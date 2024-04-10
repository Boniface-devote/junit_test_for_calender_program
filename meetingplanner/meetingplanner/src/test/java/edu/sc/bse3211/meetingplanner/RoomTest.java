package edu.sc.bse3211.meetingplanner;

import static org.junit.Assert.*;
import org.junit.Test;

public class RoomTest {
    @Test
    public void testDefaultConstructor() {
        Room room = new Room();
        assertEquals("ID should be empty string for default constructor", "", room.getID());
        assertNotNull("Calendar object should be initialized", room.calendar);
    }

    @Test
    public void testIDConstructor() {
        Room room = new Room("LLT3A");
        assertEquals("ID should be set correctly", "LLT3A", room.getID());
        assertNotNull("Calendar object should be initialized", room.calendar);
    }

    @Test(expected = TimeConflictException.class)
    public void testAddMeeting_Conflict() throws TimeConflictException {
        Room room = new Room();
        Meeting meeting1 = new Meeting(1, 15, 10, 12);
        Meeting meeting2 = new Meeting(1, 15, 11, 13);
        room.addMeeting(meeting1);
        room.addMeeting(meeting2);
    }

    @Test
    public void testAddMeeting_NoConflict() throws TimeConflictException {
        Room room = new Room();
        Meeting meeting = new Meeting(1, 15, 10, 12);
        room.addMeeting(meeting);
        assertTrue("Meeting should be added successfully", room.isBusy(1, 15, 10, 12));
    }

}
