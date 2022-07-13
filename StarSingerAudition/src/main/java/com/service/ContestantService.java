package com.service;

import java.util.ArrayList;
import com.model.Contestant;

//use appropriate annotation to configure ContestantService as a Service
public class ContestantService {
	private ArrayList<Contestant> contestantList=new ArrayList<Contestant>();
	
	//Validate emailId and add Contestant object into the Contestant list
	public boolean addContestant(Contestant Contestant) {			
		 
		return false;
			
	}

	
	public ArrayList<Contestant> viewAllContestants(){
		//fill the code
		return null;
	}
	public ArrayList<Contestant> getContestant() {
		return contestantList;
	}

	public void setContestant(ArrayList<Contestant> contestantList) {
		this.contestantList = contestantList;
	}


}
