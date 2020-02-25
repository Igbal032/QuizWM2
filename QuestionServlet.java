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
    	String backButton  = (String)request.getParameter("BackButton");
    	String nextButton  = (String)request.getParameter("NextButton");

    	// wrt.println(backButton +" Bcliced back Button");
     // 	wrt.println(nextButton +" Ncliced next Button");
    	int cQ = Integer.parseInt(currentQuestionId);
    	 if (backButton==null){
    	 	cQ++;
    	 	if (cQ>10) {
    	 		cQ--;
    	 	}
    	 }
    	 else if(nextButton==null){
    	 	cQ--;
    	 	if (cQ==0) {
    	 		cQ++;
    	 	}
    	 }

    	// if(backButton.equals("cliced")){
    	// cQ--;
    	// }
    	// else if(nextButton.equals("cliced")){

    	// }
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