package testeksamen;

import java.util.List;

public class MeetingRoom {
	
	
	/**
	 * Constructor - creates a meeting rom with maximum number of participants
	 * @param maxNumberOfParticipants
	 */
	public MeetingRoom(int maxNumberOfParticipants, String roomName) {
		
	}
	
	/**
	 * 
	 * @return the maximum number of participants in this room
	 */
	public int getMaximumNumberOfParticipants() {
		//TODO 
		return 0;
	}
	
	/**
	 * 
	 * @return the name of the room
	 */
	public String getRoomName() {
		// TODO
		return null;
	}
	
	/**
	 * Adds a participant to the meeting room
	 * @param name the name of the participant
	 * @throws IllegalStateException, if the room is at capacity
	 */
	public void addParticipant(String name) {
		// TODO
	}
	
	/**
	 * 
	 * @param name the name of a participant
	 * @return whether the participant is present in the meeting room
	 */
	public boolean isPresent(String name) {
		// TODO
		return false;
	}
	
	/**
	 * Removes a participant from the meeting room. If the name is not present, do nothing
	 * @param name the name of a participant
	 */
	public void removeParticipant(String name) {
		// TODO
		
	}
	
	/**
	 * 
	 * @return the current number of participants in the meeting room
	 */
	public int getNumberOfParticipants() {
		// TODO
		return 0;
	}
	
	/**
	 * 
	 * @return a list of all current participants in the meeting room
	 */
	public List<String> getParticipants(){
		// TODO
		return null;
	}
	
}
