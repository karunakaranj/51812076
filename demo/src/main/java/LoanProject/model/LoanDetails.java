package LoanProject.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class LoanDetails {
	private long LoanAccountNumber;
	private String status;
	private long LoanAmount;
	public long getLoanAccountNumber() {
		return LoanAccountNumber;
	}
	public void setLoanAccountNumber(long loanAccountNumber) {
		LoanAccountNumber = loanAccountNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		LoanAmount = loanAmount;
	}
	
	

}
