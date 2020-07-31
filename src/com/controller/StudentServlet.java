package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.entity.Student;
import com.service.StudentService;
/**
 * Servlet implementation class StudentServlet
 */
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
    
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String action = request.getParameter("action");
		StudentService ss= new StudentService();
		System.out.println(action);
		
		if(action.equals("addstd")) {
			String id= request.getParameter("id");
			String name= request.getParameter("name");
			String father_name = request.getParameter("fname");;
			String email_id = request.getParameter("email");;
			String course = request.getParameter("g");;
			String dept_id = request.getParameter("dept");;
			String b_g = request.getParameter("bg");;
			String mob = request.getParameter("mob");;
			
				 if(ss.sadd(id,name,father_name,email_id,course, dept_id, b_g, mob))
				 {
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				}else
					request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
		if(action.equals("delstd")) {
			String id= request.getParameter("id");
			
				 if(ss.sdelete(id)){
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				 }
				 else
				 {
					 pw.write("<h1>error occured</h1>");

				 }		 
		}
		
		
		
		
		
		if(action.equals("viewAll")) {
			ArrayList<Student> al = new ArrayList<Student>();
			 al =ss.sViewAll();
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("viewAllStd.jsp");
			 rd.forward(request, response);
		}
		
		
		if(action.equals("view")) {
			ArrayList<Student> al = new ArrayList<Student>();
			String id = request.getParameter("id");
			 al =ss.sView(id);
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("viewAllStd.jsp");
			 rd.forward(request, response);
		}
		
		
		
		
		
			
		
		
		
		
		if(action.equals("na")) {
			String id= request.getParameter("id");
			String name= request.getParameter("name");
				 if(ss.smodifyName(id,name)){
					 RequestDispatcher rd = request.getRequestDispatcher("succces.jsp");
					 rd.forward(request, response);
				 }
				 else
				 {
					 pw.write("<h1>error occured</h1>");

				 }
				 
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
