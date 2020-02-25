package wm2.quiz;


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.*;

public class QuestionServlet extends HttpServlet{
	public  void init(){

	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
	
	try{
	    PrintWriter wrt = response.getWriter();
    	
    	String userId = (String)request.getParameter("hiddenUserId");
    	String userName = (String)request.getParameter("hiddenUserName");
    	String currentQuestionId = (String)request.getParameter("getCurrentQuestionId2");
    	int cQ = Integer.parseInt(currentQuestionId);
    	cQ++;
    	wm2.quiz.findQuestion getQues = new findQuestion();
    	Question findQuestion = getQues.findQuestionWithId(cQ);
    	wrt.println("<html><head></head><body>");
     	request.getSession().setAttribute("currentQuestion",findQuestion);
        RequestDispatcher view2 = request.getRequestDispatcher("view.jsp");
		view2.forward(request,response);

		wrt.println("</body></html>");

       }	

    catch (Exception ex) {
	      	;
	}

}

}