package com.ebs.transaction.entity;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

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
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	public Long id;
	@Column(nullable = false)
	public Double amount;
	@Column(name="transaction_type",nullable = false)
	public TransactionType transactionType;
	@Column(name="reference_number",nullable = false,unique = true)
	public String referenceNumber;
	@Column(nullable = false)
	public String remark;
	@Column(name="transaction_date_time", nullable = false)
	public LocalDateTime transactionDateTime;
	@Column(nullable = false)
	public Status status;
}
