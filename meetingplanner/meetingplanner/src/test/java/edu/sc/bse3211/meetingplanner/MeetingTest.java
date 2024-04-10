package edu.sc.bse3211.meetingplanner;

import static org.junit.Assert.*;
import org.junit.Test;

public class MeetingTest {
    // Add test methods here.
    // You are not required to write tests for all classes.
    @Test
    public void testDefaultConstructor() {
        Meeting meeting = new Meeting();
        assertEquals("Month should be 0 for default constructor", 0, meeting.getMonth());
        assertEquals("Day should be 0 for default constructor", 0, meeting.getDay());
        assertEquals("Start time should be 0 for default constructor", 0, meeting.getStartTime());
        assertEquals("End time should be 23 for default constructor", 23, meeting.getEndTime());
        assertNull("Attendees list should be null for default constructor", meeting.getAttendees());
        assertNull("Room should be null for default constructor", meeting.getRoom());
        assertNull("Description should be null for default constructor", meeting.getDescription());
    }

    @Test
    public void testFullDayMeetingConstructor() {
        Meeting meeting = new Meeting(2, 16);
        assertEquals("Month should be set correctly", 2, meeting.getMonth());
        assertEquals("Day should be set correctly", 16, meeting.getDay());
        assertEquals("Start time should be 0 for full day meeting", 0, meeting.getStartTime());
        assertEquals("End time should be 23 for full day meeting", 23, meeting.getEndTime());
        assertNull("Attendees list should be null", meeting.getAttendees());
        assertNull("Room should be null", meeting.getRoom());
        assertNull("Description should be null", meeting.getDescription());
    }

    @Test
    public void testFullDayMeetingWithDescriptionConstructor() {
        Meeting meeting = new Meeting(2, 16, "Janan Luwum Holiday");
        assertEquals("Month should be set correctly", 2, meeting.getMonth());
        assertEquals("Day should be set correctly", 16, meeting.getDay());
        assertEquals("Start time should be 0 for full day meeting", 0, meeting.getStartTime());
        assertEquals("End time should be 23 for full day meeting", 23, meeting.getEndTime());
        assertNull("Attendees list should be null", meeting.getAttendees());
        assertNull("Room should be null", meeting.getRoom());
        assertEquals("Description should be set correctly", "Janan Luwum Holiday", meeting.getDescription());
    }

    @Test
    public void testDetailedMeetingConstructor() {
        Meeting meeting = new Meeting(5, 12, 10, 14);
        assertEquals("Month should be set correctly", 5, meeting.getMonth());
        assertEquals("Day should be set correctly", 12, meeting.getDay());
        assertEquals("Start time should be set correctly", 10, meeting.getStartTime());
        assertEquals("End time should be set correctly", 14, meeting.getEndTime());
        assertNull("Attendees list should be null", meeting.getAttendees());
        assertNull("Room should be null", meeting.getRoom());
        assertNull("Description should be null", meeting.getDescription());
    }

}
