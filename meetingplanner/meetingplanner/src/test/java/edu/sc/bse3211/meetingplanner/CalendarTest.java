package edu.sc.bse3211.meetingplanner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CalendarTest {
	// Add test methods here.
	// You are not required to write tests for all classes.

	@Test
	public void testAddMeeting_holiday() {
		// Create Janan Luwum holiday
		Calendar calendar = new Calendar();
		// Add to calendar object.
		try {
			Meeting janan = new Meeting(2, 16, "Janan Luwum");
			calendar.addMeeting(janan);
			// Verify that it was added.
			Boolean added = calendar.isBusy(2, 16, 0, 23);
			assertTrue("Janan Luwum Day should be marked as busy on the calendar", added);
		} catch (TimeConflictException e) {
			fail("Should not throw exception: " + e.getMessage());
		}
	}

	@Test
	public void testAddMeeting_invalidMonth() throws TimeConflictException {
		Calendar calendar = new Calendar();
		Meeting invalidMonthMeeting = new Meeting(2, 16, "Invalid Month Meeting");
		calendar.addMeeting(invalidMonthMeeting);
	}

	@Test
	public void testAddMeeting_invalidDay() throws TimeConflictException {
		Calendar calendar = new Calendar();
		Meeting invalidDayMeeting = new Meeting(2, 30, "Invalid Day Meeting");
		calendar.addMeeting(invalidDayMeeting);
	}

	@Test(expected = Exception.class)
	public void testAddMeeting_invalidStartTime() {
		Calendar calendar = new Calendar();
		Meeting invalidStartTimeMeeting = new Meeting(5, 16, 8, 0, "Invalid Start Time Meeting");
		try {
			calendar.addMeeting(invalidStartTimeMeeting);
		} catch (TimeConflictException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
