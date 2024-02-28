package com.cdac.crudOperations.pojos;






import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="AppointmentBooking")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String patientName;
	private String emailAddress;
	private int age;
	private long mobileNo;
	private String symptons;
	private String city;
	private String date;	
	private String time;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String patientName, String emailAddress, int age, long mobileNo, String symptons,
			String city, String date, String time) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.emailAddress = emailAddress;
		this.age = age;
		this.mobileNo = mobileNo;
		this.symptons = symptons;
		this.city = city;
		this.date = date;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSymptons() {
		return symptons;
	}

	public void setSymptons(String symptons) {
		this.symptons = symptons;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", patientName=" + patientName + ", emailAddress=" + emailAddress + ", age=" + age
				+ ", mobileNo=" + mobileNo + ", symptons=" + symptons + ", city=" + city + ", date=" + date + ", time="
				+ time + "]";
	}
	
	

}
