package com.ebs.beneficiary.entity;

import com.ebs.customer.entity.Customers;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Beneficiaries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="beneficiary_id")
	public Long id;
	@Column(name="customer_id")
	@OneToOne
	public Customers customer;
	@Column(name="beneficiary_name",nullable = false)
	public String name;
	@Column(name="account_number",unique = true , nullable = false)
	public String accountNumber;
	@Column(name="ifsc_code" , unique=true  , nullable=false)
	public String IFSCCode;
}
