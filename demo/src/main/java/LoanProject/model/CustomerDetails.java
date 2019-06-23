package LoanProject.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Cusid;
	private String Name;
	private int Mob;
	private Date Dob;
	private String Gender;
	private String MaritalStatus;
	private long CreditScore;
	private double salary;
	private double expense;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMob() {
		return Mob;
	}
	public void setMob(int mob) {
		Mob = mob;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public long getCreditScore() {
		return CreditScore;
	}
	public void setCreditScore(long creditScore) {
		CreditScore = creditScore;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getExpense() {
		return expense;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	
	
	
	
	
	

}
