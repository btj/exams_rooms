package exams_rooms;

import java.util.HashSet;
import java.util.Set;

/**
 * @invar | getExams() != null
 * @invar | getExams().stream().allMatch(exam -> exam != null && exam.getRooms().contains(this))
 */
public class Room {

	/**
	 * @invar | exams != null
	 * @invar | exams.stream().allMatch(exam -> exam != null && exam.getRooms().contains(this))
	 * @representationObject
	 * @peerObjects
	 */
	Set<Exam> exams = new HashSet<Exam>();
	
	/**
	 * @creates | result
	 * @peerObjects
	 */
	public Set<Exam> getExams() {
		return Set.copyOf(exams); 
	}
	
	/**
	 * @mutates | this
	 * @post | getExams().isEmpty()
	 */
	public Room() {}
	
}
