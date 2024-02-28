package com.cdac.crudOperations.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Enquiry")
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String name;
    private String mobileNO;
    private String typesofQuery;
    public Enquiry() {
		// TODO Auto-generated constructor stub
	}
	public Enquiry(Integer id, String name, String mobileNO, String typesofQuery) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNO = mobileNO;
		this.typesofQuery = typesofQuery;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(String mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getTypesofQuery() {
		return typesofQuery;
	}
	public void setTypesofQuery(String typesofQuery) {
		this.typesofQuery = typesofQuery;
	}
	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", name=" + name + ", mobileNO=" + mobileNO + ", typesofQuery=" + typesofQuery
				+ "]";
	}
    

}
