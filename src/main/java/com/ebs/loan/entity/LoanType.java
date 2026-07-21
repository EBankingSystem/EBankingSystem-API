package com.ebs.loan.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

//jakarta annotations
@Entity
@Table(name = "loan_types")
//lombok annotation
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loanTypeId;

    @Column(name = "loan_name",nullable = false, length = 50)
    private String loanName;

    @Column(name = "interest_rate",nullable = false, precision = 5, scale = 2)
    private BigDecimal interestRate;
}
