package wm2.quiz;


import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.*;

public class CalculateServlet extends HttpServlet{
	public  void init(){

	}
  int FalseAnswer = 0;
  int TrueAnswer = 0;
  int totalScore = 1;
	public void doPost(HttpServletRequest request,HttpServletResponse response) {

	try{
        PrintWriter wrt = response.getWriter();
        wm2.quiz.findQuestion newFinQues = new wm2.quiz.findQuestion();
        // wrt.println();
        ArrayList<CheckedAnswerss> checkAnswersList = newFinQues.checkedAnswerList;
        Iterator iterator = checkAnswersList.iterator();
        while(iterator.hasNext()) {
          CheckedAnswerss stdQ = (CheckedAnswerss)iterator.next();
          if (stdQ.getTF()==true) {
            TrueAnswer++;
            totalScore=TrueAnswer*10;
          }
          else{
            FalseAnswer++;
          }
        }  

      Result newResult = new Result();
      newResult.setTrue(TrueAnswer);
      newResult.setFalse(FalseAnswer);
      newResult.setTotalScore(totalScore);

    	wrt.println("<html><head></head><body>");
       request.getSession().setAttribute("Result",newResult);
       RequestDispatcher view2 = request.getRequestDispatcher("resultPage.jsp");
		   view2.forward(request,response);

		wrt.println("</body></html>");

      
        }

    catch (Exception ex) {
	      	System.out.println(ex);
	}

}

}