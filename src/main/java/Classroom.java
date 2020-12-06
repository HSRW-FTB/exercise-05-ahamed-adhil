import java.util.Date ;
class   Classroom {
	private String id;
	private Course course;
	private Student[] participants;
	private String room;
	private String term;
	private Date date = new Date();
	
	
	
	
	
	private Classroom() {
	}
	public Classroom (Course course, String room) {
		this.course=course ;
		this.room=room;
	}
public Classroom (Course course, String room,Date date) {
			this.course=course ;
			this.room=room;
			this.date =date;
	}
	
public Course getcourse() {
	return this.course;
	
}
	

}
