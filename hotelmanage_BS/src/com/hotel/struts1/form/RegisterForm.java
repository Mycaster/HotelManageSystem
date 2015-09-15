package com.hotel.struts1.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
public class RegisterForm extends ActionForm {
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);

	}
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.validate(mapping, request);
	}
	private String cnickname = null;
	private String cname = null;
	private String cpassword = null;
	private String cphone = null;
	private String caddress = null;
	private String csex = null;
	private String cemail = null;
	private String cverfyId = null;
	public String getCnickname() {
		return cnickname;
	}
	public void setCnickname(String cnickname) {
		this.cnickname = cnickname;
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
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCsex() {
		return csex;
	}
	public void setCsex(String csex) {
		this.csex = csex;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCverfyId() {
		return cverfyId;
	}
	public void setCverfyId(String cverfyId) {
		this.cverfyId = cverfyId;
	}
	

}
