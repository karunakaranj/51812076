package LoanProject.service;

import org.springframework.stereotype.Service;

import LoanProject.model.CustomerDetails;
import LoanProject.model.LoanDetails;


public interface LoanService {
	public  LoanDetails addloan(CustomerDetails cusdetails);
	public  LoanDetails deleteloan(CustomerDetails cusdetails);
	public  LoanDetails updateloan( CustomerDetails cusdetails );
	
	}
