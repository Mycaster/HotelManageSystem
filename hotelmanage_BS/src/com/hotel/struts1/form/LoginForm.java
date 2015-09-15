package com.hotel.struts1.form;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;
public class LoginForm extends ValidatorForm {
	private String cname  =null;
	private String cpassword = null;
	@Override
	public ActionErrors validate(ActionMapping arg0, ServletRequest arg1) {
		// TODO Auto-generated method stub
		System.out.print("AAAA");
		System.out.print(getCname());
		ActionErrors errors = new ActionErrors();
		if(cname ==""){
			errors.add("userNameError",new ActionMessage("nameNull"));
		}
		else if(cpassword ==""){
			errors.add("userPassError",new ActionMessage("passNull"));
		}
		return errors;
	}


	@Override
	public void reset(ActionMapping arg0, ServletRequest arg1) {
		// TODO Auto-generated method stub
		cname = null;
		cpassword = null;
	}
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
}
