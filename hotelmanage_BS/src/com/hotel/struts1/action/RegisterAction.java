package com.hotel.struts1.action;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.hotel.hibernate.Customer;
import com.hotel.hibernate.CustomerDAO;
import com.hotel.struts1.form.RegisterForm;

public class RegisterAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request,
			HttpServletResponse respnose){
		RegisterForm registerForm = (RegisterForm)form;
		String cName = registerForm.getCname();
		String cNickname = registerForm.getCnickname();
		String cPass = registerForm.getCpassword();
		String cPassword = MD5.md5(cPass);
		String cPhone = registerForm.getCphone();
		String cAddress = registerForm.getCaddress();
		String cEmail = registerForm.getCemail();
		String cSex = registerForm.getCsex();
		String cVerifyID = registerForm.getCverfyId();


        CustomerDAO dao = new CustomerDAO();
        Customer newcus = new Customer();
//        List list = dao.findByExample(new Customer());
//        for(int i = 0;i<list.size();i++){
//          Customer cus = (Customer)list.get(i);
//        //  if()
//        }
        System.out.print(cName);
        newcus.setCname(cName);
        newcus.setCnickname(cNickname);
        newcus.setCpassword(cPassword);
        newcus.setCaddress(cAddress);
        newcus.setCsex(cSex);
        newcus.setCphone(cPhone);
        newcus.setCverifyId(cVerifyID);
        newcus.setCemail(cEmail);
        System.out.print(cName);
        dao.save(newcus);
        
		return mapping.findForward("successRegist");
		}
}