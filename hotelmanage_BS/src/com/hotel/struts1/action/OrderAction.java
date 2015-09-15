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
import com.hotel.hibernate.Myorder;
import com.hotel.hibernate.MyorderDAO;
import com.hotel.struts1.form.MyOrderForm;
import com.hotel.struts1.form.RegisterForm;

public class OrderAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,HttpServletRequest request,
			HttpServletResponse respnose){
		MyOrderForm orderForm = (MyOrderForm)form;
		String roomtype = orderForm.getRoomtype();
		String roomprice = orderForm.getRoomprice();
		String timein = orderForm.getOtimeIn();
		String timeout = orderForm.getOtimeOut();
        MyorderDAO orderdao = new MyorderDAO();
        Myorder neworder = new Myorder();
//        List list = dao.findByExample(new Customer());
//        for(int i = 0;i<list.size();i++){
//          Customer cus = (Customer)list.get(i);
//        //  if()
//        }
//       System.out.print(cName);
        neworder.setRoom(roomtype);
        neworder.setTimeIn(timein);
        neworder.setTimeOut(timeout);
        orderdao.save(neworder);
		return mapping.findForward("successOrder");
		}
}