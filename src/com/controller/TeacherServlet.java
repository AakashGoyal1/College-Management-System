package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Teacher;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherServlet
 */
public class TeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String action = request.getParameter("action");
		TeacherService ts= new TeacherService();
		System.out.println(action);
		
		if(action.equals("viewAll")) {
			ArrayList<Teacher> al = new ArrayList<Teacher>();
			 al =ts.sViewAll();
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("viewAllTeacher.jsp");
			 rd.forward(request, response);
		}
		
		
		if(action.equals("view")) {
			ArrayList<Teacher> al = new ArrayList<Teacher>();
			String id = request.getParameter("id");
			 al =ts.sView(id);
			 request.setAttribute("al",al);
			 RequestDispatcher rd = request.getRequestDispatcher("viewAllTeacher.jsp");
			 rd.forward(request, response);
		}
		
		
		
		if(action.equals("delTeach")) {
			String id= request.getParameter("id");
			
				 if(ts.sdelete(id)){
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				 }
				 else
				 {
					 pw.write("<h1>error occured</h1>");

				 }		 
		}
		
			
		if(action.equals("addTeach")) {
			String id= request.getParameter("id");
			String name= request.getParameter("name");
			String father_name = request.getParameter("fname");;
			String email_id = request.getParameter("email");;
			String gender = request.getParameter("g");;
			String dept_id = request.getParameter("dept");;
			String b_g = request.getParameter("bg");;
			String mob = request.getParameter("mob");;
			
				 if(ts.sadd(id,name,father_name,email_id,gender, dept_id, b_g, mob))
				 {
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				}else
					request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		if(action.equals("assign")) {
			String tid= request.getParameter("id");
			String sid= request.getParameter("sid");
			System.out.println("aaaa  "+tid+"     "+sid);
			
				 if(ts.assign(tid,sid))
				 {
					 RequestDispatcher rd = request.getRequestDispatcher("Succces.jsp");
					 rd.forward(request, response);
				}else
					request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
		
		
		
		
		
		
		
		
	}	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
