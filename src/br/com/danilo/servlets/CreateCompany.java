package br.com.danilo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create")
public class CreateCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		String name = request.getParameter("name");
		
		Company company = new Company();
		company.setName(name);
		
		DbMock db = new DbMock();
		db.add(company);
		
		request.setAttribute("name", name);
		RequestDispatcher rd = request.getRequestDispatcher("/created.jsp");
		rd.forward(request, response);
	}
}
