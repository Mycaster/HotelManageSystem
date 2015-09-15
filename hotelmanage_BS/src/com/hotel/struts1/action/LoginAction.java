package com.hotel.struts1.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.hibernate.Session;

import java.util.List;

import com.hotel.hibernate.Customer;
import com.hotel.hibernate.CustomerDAO;
import com.hotel.struts1.form.LoginForm;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request,
			HttpServletResponse respnose){
		LoginForm loginform = (LoginForm)form;
		String inputName = loginform.getCname();
		String inputPassword = loginform.getCpassword();
        System.out.print("inputName:"+inputName);
        ActionMessages errors = new ActionMessages();
		//if(isCorrect(inputName, inputPassword)){

	    if(inputName ==""){
	    	System.out.print("inputName");
			errors.add("userNameError",new ActionMessage("nameNull"));
			return mapping.findForward("fail");
		}
		else if(inputPassword ==""){
			System.out.print("inputPassword");
			
			errors.add("userPassError",new ActionMessage("passNull"));
			return mapping.findForward("fail");
		}else if(!inputName.equals("huss")){
			 errors.add("errorUserInfo",new ActionMessage("userInfo_wrong"));
			 this.saveErrors(request, errors);
			 return mapping.findForward("fail");
		}else {
	    	//System.out.print("inputName.equals");
			HttpSession session = request.getSession();
			session.setAttribute("userNickname", inputName);
			System.out.print(" success");
			return mapping.findForward("successlogin");
		}

	}
	public boolean isCorrect(String inputName ,String inputPassword){
		CustomerDAO dao = new CustomerDAO();
        List list = dao.findByExample(new Customer());
        int i= 0;
        boolean flag = true;
        while(i<list.size()&& flag){
        	Customer Cus = (Customer)list.get(i);
	    	if(inputName.equals(Cus.getCnickname())){
	    		if(inputPassword.equals(Cus.getCpassword() )){
		    		flag = false;
	    		}
	    	}
	    //	System.out.print(Cus.getCnickname());
	    	i++;
		 }
        return !flag;
	}
}
