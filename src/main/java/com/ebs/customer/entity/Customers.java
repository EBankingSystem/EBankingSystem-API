package com.ebs.customer.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column(name="first_name", nullable = false)
	public String firstName;
	@Column(name="middle_name", nullable = false)
	public String middleName;
	@Column(name="last_name", nullable = false)
	public String lastName;
	@Column(nullable = false)
	public LocalDate DOB;
	@Column(nullable = false)
	public String mobile;
	@Column(nullable = false)
	public String address;
	
}
