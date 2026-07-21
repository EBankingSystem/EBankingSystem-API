package com.ebs.loan.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "loan_repayments")

//lombok annotaions
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"loan"})
public class LoanRepayment {
	
	@Id
	@Column(name = "repayment_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer repaymentId;
	
	@ManyToOne //loan --> loan_repayments
	@JoinColumn(name = "loan_id",nullable = false)
	private Loan loan;
	
	@Column(name = "amount_paid",nullable = false,precision = 15,scale = 2)
	private BigDecimal amountPaid;
	
	@Column(name = "payment_date")
	private LocalDateTime paymentDate;
	
	@Column(name = "due_date",nullable = false)
	private LocalDateTime dueDate;
}
