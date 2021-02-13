package br.com.danilo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class GetCompanys extends HttpServlet {
  private static final long serialVersionUID = 1L;
    
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
	List<Company> companys = new DbMock().getCompanys();
	
	request.setAttribute("companys", companys);
	RequestDispatcher rd = request.getRequestDispatcher("/get.jsp");
	rd.forward(request, response);
  }
}
