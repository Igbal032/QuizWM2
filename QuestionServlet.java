package wm2.quiz;


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.*;

public class QuestionServlet extends HttpServlet{
	public  void init(){

	}

	public void doGet(HttpServletRequest request,HttpServletResponse response) {
	
	try{
	    PrintWriter wrt = response.getWriter();
    
    	wrt.println("<html><head></head><body>");
    	wrt.println("Salam");

  //   	request.getSession().setAttribute("newStudent",newStudent);
		// RequestDispatcher view = request.getRequestDispatcher("view.jsp");
		// view.forward(request,response);

		wrt.println("</body></html>");

       }	

    catch (Exception ex) {
	      	;
	}

}

}