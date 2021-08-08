package HomeBook.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import HomeBook.model.User;
import JDBC_book.listUser;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		String user = (String)request.getParameter("user");
		String pass = (String)request.getParameter("password");
		
		String query = "select * from `web_book`.`user`"
				+ " where `web_book`.`user`.`email` =? ";
		
		
		listUser list = new listUser();
		List<User> list_user = list.getUser(query, user, pass);
		
		for(User us : list_user) {
			if(us != null) {
				response.sendRedirect("/WebBook/home");
			} else {
				response.sendRedirect("FormLogin.jsp");
			}
		}
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			processRequest(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			processRequest(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
