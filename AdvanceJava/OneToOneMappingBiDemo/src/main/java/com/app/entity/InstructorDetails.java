package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class InstructorDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String hobby;
	@Column
	private String subject;
	
	@OneToOne(mappedBy = "instructorDetails",cascade = CascadeType.PERSIST)
	private Instructor instructor;
	

	public InstructorDetails(String hobby, String subject) {
		super();
		this.hobby = hobby;
		this.subject = subject;
	}
	
	
	

}
