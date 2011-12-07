package net.viralpatel.maven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorldServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1031422249396784970L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String temp = req.getRequestURL().toString();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Hello World from Servlet<br/>");
		out.println(temp + " : is working yippie!!!!");
		out.flush();
		out.close();
	}
}
