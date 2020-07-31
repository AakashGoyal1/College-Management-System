package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.Department;
import com.service.DeptService;

/**
 * Servlet implementation class DeptServlet
 */
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String action = request.getParameter("action");
		DeptService ds = new DeptService();
		System.out.println(action);
		
		if(action.equals("modifyDept")) {
			String id= request.getParameter("id");
			String head= request.getParameter("head");
			
				 if(ds.smodify(id,head)){
					 pw.write("<h1>Successfully Modified</h1>");
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				 }
				 else
				 {
					 pw.write("<h1>error occured</h1>");

				 }
				 
		}
		
		if(action.equals("addDept")) {
			String id= request.getParameter("id");
			String name= request.getParameter("name");
			String head= request.getParameter("head");
				 if(ds.sadd(id,name,head)){
					 RequestDispatcher rd = request.getRequestDispatcher("Dept.jsp");
					 rd.forward(request, response);
				 }
				 else
					 request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
		if(action.equals("viewAll")) {
			ArrayList<Department> al = new ArrayList<Department>();
			 al =ds.sViewAll();
			 for(Department d : al)
				 System.out.println(d);
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("ViewAllDept.jsp");
			 rd.forward(request, response);
		}
		
		if(action.equals("view")) {
			ArrayList<Department> al = new ArrayList<Department>();
			String id= request.getParameter("id"); 
			al =ds.sView(id);
			if(al != null) {
			 for(Department d : al)
				 System.out.println(d);
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("ViewAllDept.jsp");
			 rd.forward(request, response);}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("Error.jsp");
				 rd.forward(request, response);
				
			}
			
		}
		
		
//		if(action.equals("viewAll")) {
//			ArrayList<Department> al = new ArrayList<Department>();
//			 al =ds.sViewAll();
//			 request.setAttribute("al",al);
//			 System.out.println(al);
//			 RequestDispatcher rd = request.getRequestDispatcher("ViewAllDept.jsp");
//			 System.out.println("123450");
//			 rd.forward(request, response);
//		}
//		
	
	}
	

}
