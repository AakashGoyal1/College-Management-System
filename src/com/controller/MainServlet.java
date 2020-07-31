package com.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.service.AdminService;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public MainServlet() {
        super();
         
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 		response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String action = request.getParameter("action");
			AdminService as = new AdminService();
			if(action.equals("SUBMIT")) {
				 String you= request.getParameter("you");
				 if(you.equals("Admin")) {
					 String id= request.getParameter("id");
					 String pass= request.getParameter("pass");
				
					 if(as.alogin(id,pass)){
						 RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
						 rd.forward(request, response);
					 }else {
						 System.out.println("else");
						 HttpSession sn = request.getSession();
						 sn.setAttribute("message", "Enter valid Credentials");
						 RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
						 rd.forward(request, response);
						 }
				 }
				 else if(you.equals("Teacher")) {
					 String id= request.getParameter("id");
					 String pass= request.getParameter("pass");
				
					 if(as.tlogin(id,pass)){
						 RequestDispatcher rd = request.getRequestDispatcher("Teacher.jsp");
						 rd.forward(request, response);
					 }else {
						 pw.write("<h1>error</h1>");
						 
						 }
				 }else if(you.equals("Student")) {
					 String id= request.getParameter("id");
					 String pass= request.getParameter("pass");
				
					 if(as.slogin(id,pass)){
						 RequestDispatcher rd = request.getRequestDispatcher("Student.jsp");
						 rd.forward(request, response);
					 }else {
						 pw.write("<h1>error</h1>");
						 }
				 
					 
			}else {
				request.getRequestDispatcher("Error.jsp").forward(request, response);
			}
				 
				 
				 
				 
//			if(action.equals("viewall")) {
//				ArrayList<Customer> al = new ArrayList<Customer>();
//				 al =as.sViewAll();
//				 request.setAttribute("al",al);
//				  RequestDispatcher rd = request.getRequestDispatcher("CustomerRecord.jsp");
//				  rd.forward(request, response);
//					}
//			if(action.equals("delete"))
//		 	{
//		 		RequestDispatcher rd = request.getRequestDispatcher("Delete.jsp");
//				rd.forward(request, response);
//		 	}
//			if(action.equals("deletion"))
//		 	{
//				 String iD=  request.getParameter("identity");
//				 Integer id =Integer.parseInt(iD);
//				 System.out.println("me iha pahuch gaya ba");
//				 if(as.sdelete(id))
//					 request.getRequestDispatcher("Done.jsp").forward(request, response);
//				 else
//					 request.getRequestDispatcher("Error.jsp").forward(request, response);
//
//		
//		 	}
//			if(action.equals("Modify")) {
//				 String uname= request.getParameter("rname");
//				 Integer id= Integer.parseInt(request.getParameter("ano"));
//				 String password= request.getParameter("pwd");
//				 String address= request.getParameter("address");
//				 if(as.smodify(uname, id, password,address))
//				 {
//					 pw.write("<h1>Modify Sucessfully!!!!!!!!!!!!</h1>");
//					  RequestDispatcher rd = request.getRequestDispatcher("CustomerRecord.jsp");
//					  rd.forward(request, response);
//				 }
//				 else
//				 {
//					 
//					  pw.write("<h1>error</h1>");
//
//				 }
//			}
//			if(action.equals("CUSTOMER")) {
//				
//				 String uname= request.getParameter("name");
//				 Integer id= Integer.parseInt(request.getParameter("identity"));
//				 String password= request.getParameter("password");
//				 if(as.clogin(uname, id, password)!=null)
//				 {
//					  RequestDispatcher rd = request.getRequestDispatcher("CustomerPage.jsp");
//					  request.setAttribute("cus", as.clogin(uname, id, password));
//					  rd.forward(request, response);
//				 }
//				 else
//				 {
//					  pw.write("<h1>error</h1>");
//
//				 }
//				 			}
//                if(action.equals("register")) 
//                {
//				String uname,adno,add,pass;
//				uname=request.getParameter("rname");
//				adno=request.getParameter("adno");
//				add=request.getParameter("address");
//				pass=request.getParameter("password");
//				int billAmt=0;
//				int billNo=0;
//				Customer c=new Customer(uname, adno, add, pass, billAmt, billNo);
//				CustomerService cs=new CustomerService();
//				if(cs.sInsert(c)) {
//					RequestDispatcher rd=request.getRequestDispatcher("RegisterationSuccess.jsp");
//					rd.forward(request, response);
//				}
//				else {
//					RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
//					rd.forward(request, response);	
//				}
//			
//                }
//                if(action.equals(" pay "))
//                {
//                	String uname=request.getParameter("name");
//                	String adno=request.getParameter("identity");
//                	System.out.println(uname);
//                	System.out.println(adno);
//                }
			}
	 	}
}
	 	 
			
	    


