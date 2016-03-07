package service;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NumberBean;
import util.RandomUtil;

@WebServlet("/random-number")
public class Randomizer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		NumberBean bean = RandomUtil.RandomNumber(req.getParameter("range"));
		//We add the bean to the request and not the session or application!!
		req.setAttribute("randomnumber", bean);
		
		//Get the result url and forward the result
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/randomResult.jsp");
		dis.forward(req, resp);
	}
}
