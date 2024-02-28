package com.cdac.crudOperations.pojos;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="patientHistory")
public class PatientHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String patientName;
    private String address;
    private Date date;
    private String problem;
    private String history;
    private String suggestedMedicine;
    private String report;
   public PatientHistory() {
	// TODO Auto-generated constructor stub
}
public PatientHistory(Integer id, String patientName, String address, Date date, String problem, String history,
		String suggestedMedicine, String report) {
	super();
	this.id = id;
	this.patientName = patientName;
	this.address = address;
	this.date = date;
	this.problem = problem;
	this.history = history;
	this.suggestedMedicine = suggestedMedicine;
	this.report = report;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getProblem() {
	return problem;
}
public void setProblem(String problem) {
	this.problem = problem;
}
public String getHistory() {
	return history;
}
public void setHistory(String history) {
	this.history = history;
}
public String getSuggestedMedicine() {
	return suggestedMedicine;
}
public void setSuggestedMedicine(String suggestedMedicine) {
	this.suggestedMedicine = suggestedMedicine;
}
public String getReport() {
	return report;
}
public void setReport(String report) {
	this.report = report;
}
@Override
public String toString() {
	return "PatientHistory [id=" + id + ", patientName=" + patientName + ", address=" + address + ", date=" + date
			+ ", problem=" + problem + ", history=" + history + ", suggestedMedicine=" + suggestedMedicine + ", report="
			+ report + "]";
}
   
	
	
	

}
