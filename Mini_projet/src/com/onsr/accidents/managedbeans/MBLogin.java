package com.onsr.accidents.managedbeans;

import java.sql.SQLException;
import java.sql.Statement;





import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import com.onsr.accidents.business.Login;
import com.onsr.accidents.dao.LoginDao;

public class MBLogin {
	Statement st;
	Login l=new Login();
	
	
	public Login getL() {
		return l;
	}
	public void setL(Login l) {
		this.l = l;
	}
	
	public void valid() throws SQLException
	{     
		LoginDao ld=new LoginDao();
		if(ld.validate(l)==true)
		{
			
		}
		else
		{FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_INFO,"validation","le mot de passe incorrect");
		RequestContext.getCurrentInstance().showMessageInDialog(msg);}
	}

}
