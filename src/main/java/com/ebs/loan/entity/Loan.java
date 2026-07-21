package com.ebs.loan.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//jakarta annotaions
@Entity
@Table(name="loans")
//lombok annotaions
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"loanType"}) //later add customer here when customer is created
public class Loan {

	@Id
	@Column(name="loan_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer loanId;
	
//	@ManyToOne //customer --> loans
//	@JoinColumn(name = "customer_id",nullable = false)
//	private Customer customer;
	
	@ManyToOne //loantype  --> loans 
	@JoinColumn(name = "loan_type_id",nullable = false)
	private LoanType loanType;
	
	@Column(name = "amount",nullable = false,precision = 15 ,scale = 2)
	private BigDecimal amount;
	
	@Column(name = "emi",precision = 15 ,scale = 2)
	private BigDecimal emi;
	
	@Column(name = "tenure_months",nullable = false)
	private Integer tenureMonths;
	
	@CreationTimestamp
	@Column(name = "application_date",nullable = false)
	private LocalDateTime applicationDate;
	
	private LocalDateTime approvedDate;
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	@Column(name = "remaining_amount",precision = 15,scale =2)
	private BigDecimal remainingAmount;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status",nullable = false)
	private LoanStatus status;
	
	
	
}
