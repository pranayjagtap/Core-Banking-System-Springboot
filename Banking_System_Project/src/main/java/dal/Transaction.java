package main.java.dal;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import main.java.dal.accounts.Account;
import main.java.dal.users.employees.Employee;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transactionID", updatable = false, nullable = false)
	private String transactionID;
	private Account payer;
	private Account payee;
	private Double amount;
	private boolean approvalStatus;
	private Employee approver;
	@CreatedDate
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Transaction(Account payer,
			Account payee,
			Double amount)
	{
		
		this.payer = payer;
		this.payee = payee;
		this.amount = amount;
	}
	
	public boolean isApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public Employee getApprover() {
		return approver;
	}
	public void setApprover(Employee approver) {
		this.approver = approver;
	}
	public String getTransactionID() {
		return transactionID;
	}
	public Account getPayer() {
		return payer;
	}
	public Account getPayee() {
		return payee;
	}
	public Double getAmount() {
		return amount;
	}
	public Date getDate() {
		return date;
	}
	
}