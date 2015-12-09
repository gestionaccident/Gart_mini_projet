package com.onsr.accidents.managedbeans;



import java.util.ArrayList;
import java.util.List;

import com.onsr.accidents.business.Accident;

import com.onsr.accidents.dao.AccidentDAO;



public class Managed_Bean_Accident {
	List<Accident> list_acc=new ArrayList<Accident>();
	public List<Accident> getList_acc() {
		AccidentDAO acc_dao=new AccidentDAO();
		list_acc=acc_dao.liste_Acci();
		return list_acc;
	}

	public void setList_acc(List<Accident> list_acc) {
		this.list_acc = list_acc;
	}

	Accident accident =new  Accident();

	public Accident getAccident() {
		return accident;
	}

	public void setAccident(Accident accident) {
		this.accident = accident;
	}

	
	
	
	
	
	
	
	
	
	
	
}
