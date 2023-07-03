package com.example.demo.entities;
import javax.persistence.*;

	@Entity
	@Table(name = "employees")
	public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String address;
	    private String occupation;
	    private String hobby;
	    private String gender;
	    
	    
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Employee(Long id, String name, String address, String occupation, String hobby, String gender) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.occupation = occupation;
			this.hobby = hobby;
			this.gender = gender;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getOccupation() {
			return occupation;
		}


		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}


		public String getHobby() {
			return hobby;
		}


		public void setHobby(String hobby) {
			this.hobby = hobby;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}

	   
	    
}



