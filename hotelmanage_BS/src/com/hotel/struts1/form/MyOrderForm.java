package com.hotel.struts1.form;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;
public class MyOrderForm extends ActionForm {
	private String roomtype  =null;
	private String roomprice  =null;
	private String otimein = null;
	private String otimeout = null;
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getRoomprice() {
		return roomprice;
	}
	public void setRoomprice(String roomprice) {
		this.roomprice = roomprice;
	}
	public String getOtimein() {
		return otimein;
	}
	public void setOtimein(String otimein) {
		this.otimein = otimein;
	}
	public String getOtimeout() {
		return otimeout;
	}
	public void setOtimeout(String otimeout) {
		this.otimeout = otimeout;
	}


	
}
