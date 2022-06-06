package testeksamen;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MeetingRoomTest {
	
	private MeetingRoom meetingRoom;
	
	@BeforeEach
	public void setup() {
		meetingRoom = new MeetingRoom(4, "Test");
	}
	
	@Test
	public void testInitializeAndGetName() {
		Assertions.assertEquals("Test", meetingRoom.getRoomName());
	}
	
	@Test
	public void testInitializeAndGetMaxNumberOfParticipants() {
		Assertions.assertEquals(4, meetingRoom.getMaximumNumberOfParticipants());
	}
	
	@Test
	public void testInitializedMeetingRoomIsEmpty() {
		Assertions.assertEquals(0, meetingRoom.getNumberOfParticipants());
	}
	
	@Test
	public void testAddParticipantUpdatesNumberOfParticipants() {
		meetingRoom.addParticipant("Test1");
		Assertions.assertEquals(1, meetingRoom.getNumberOfParticipants());
	}
	
	@Test
	public void testIsPresent() {
		meetingRoom.addParticipant("Test1");
		Assertions.assertTrue(meetingRoom.isPresent("Test1"));
	}
	
	@Test
	public void testIsNotPresent() {
		meetingRoom.addParticipant("Test1");
		Assertions.assertFalse(meetingRoom.isPresent("Test2"));
	}
	
	@Test
	public void testGetParticipants() {
		meetingRoom.addParticipant("Test1");
		meetingRoom.addParticipant("Test2");
		List<String> participants = meetingRoom.getParticipants();
		Assertions.assertTrue(participants.contains("Test1"));
		Assertions.assertTrue(participants.contains("Test2"));
		Assertions.assertEquals(2, participants.size());
	}
	
	@Test
	public void testGetParticipantsEncapsulation() {
		meetingRoom.addParticipant("Test1");
		meetingRoom.addParticipant("Test2");
		List<String> participants = meetingRoom.getParticipants();
		participants.add("ShouldNotBeInOriginalList");
		Assertions.assertEquals(2, meetingRoom.getNumberOfParticipants());
	}
	
	@Test
	public void testRemoveParticipant() {
		meetingRoom.addParticipant("Test");
		meetingRoom.removeParticipant("Test");
		Assertions.assertFalse(meetingRoom.isPresent("Test"));
	}
	
	@Test
	public void testAddMoreThanMaximumNumberOfParticipants() {
		meetingRoom.addParticipant("Test1");
		meetingRoom.addParticipant("Test2");
		meetingRoom.addParticipant("Test3");
		meetingRoom.addParticipant("Test4");
		Assertions.assertThrows(IllegalStateException.class, () -> {
			meetingRoom.addParticipant("Test5");
		});

	}
}
