package edu.sc.bse3211.meetingplanner;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OrganizationTest {
    @Test
    public void testDefaultEmployeesList() {
        Organization org = new Organization();
        ArrayList<Person> employees = org.getEmployees();

        assertEquals("Employee list should have 5 elements", 5, employees.size());
        assertEquals("First employee name should be Namugga Martha", "Namugga Martha", employees.get(0).getName());
        assertEquals("Last employee name should be Kukunda Lynn", "Kukunda Lynn", employees.get(4).getName());
    }

    @Test
    public void testDefaultRoomsList() {
        Organization org = new Organization();
        ArrayList<Room> rooms = org.getRooms();

        assertEquals("Room list should have 5 elements", 5, rooms.size());
        assertEquals("First room ID should be LLT6A", "LLT6A", rooms.get(0).getID());
        assertEquals("Last room ID should be LAB2", "LAB2", rooms.get(4).getID());
    }

    @Test
    public void testGetEmployeeExisting() throws Exception {
        Organization org = new Organization();
        Person employee = org.getEmployee("Shema Collins");

        assertNotNull("Employee should not be null", employee);
        assertEquals("Employee name should be Shema Collins", "Shema Collins", employee.getName());
    }

    @Test(expected = Exception.class)
    public void testGetEmployeeNonexistent() throws Exception {
        Organization org = new Organization();
        org.getEmployee("Nonexistent Employee");
    }

    @Test
    public void testGetRoomExisting() throws Exception {
        Organization org = new Organization();
        Room room = org.getRoom("LLT3A");

        assertNotNull("Room should not be null", room);
        assertEquals("Room ID should be LLT3A", "LLT3A", room.getID());
    }

    @Test(expected = Exception.class)
    public void testGetRoomNonexistent() throws Exception {
        Organization org = new Organization();
        org.getRoom("Nonexistent Room");
    }

}
