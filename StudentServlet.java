package wm2.quiz;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.PrintWriter;
import java.util.*;

public class StudentServlet extends HttpServlet{
	public  void init(){
	ArrayList<Question> questionList = new ArrayList<Question>();
	ArrayList<Variants> VariantList = new ArrayList<Variants>();
	Question newQuestion = new Question();
	newQuestion.SetId(1);
	newQuestion.setQstatement("Salam Necesiz?");
	newQuestion.setAnswerId(2);
	questionList.add(newQuestion);

    // ArrayList<Integer id, String statement> questionList = new ArrayList();
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
	Integer ID=0;
	String firstName = (String)request.getParameter("firstName");
	String lastName = (String)request.getParameter("lastName");
	String password = (String)request.getParameter("password");
	String email = (String)request.getParameter("email");
	boolean checkStudent=false;
	ArrayList<Student> registeredStudent = new ArrayList<Student>();
	int size = registeredStudent.size();

	System.out.println("<h1>Salam</h1>");
	try{
	    PrintWriter wrt = response.getWriter();
    
    	wrt.println("<html><head></head><body>");

    	if (firstName.equals("") || lastName.equals("")||email.equals("")||password.equals("")) {
    
	   			 wrt.println("<h1>Please,fill all inputs</h1>");
		}
		else{
				
				//TO DO
				Student newStudent = new Student();
				newStudent.setId(++ID);
	            newStudent.setName(firstName);
	            newStudent.setSurname(lastName);
	            newStudent.setPassword(password);
	            newStudent.setEmail(email);
	            newStudent.setCurrentQuestionId(1);
	            registeredStudent.add(newStudent);
    			wrt.println("<h1>>2!</h1>");
				Iterator iterator = registeredStudent.iterator();
				while(iterator.hasNext()) {
				Student std = (Student)iterator.next();
    			if (std.getEmail().equals(email)) {
    				request.getSession().setAttribute("newStudent",newStudent);
		            RequestDispatcher view = request.getRequestDispatcher("view.jsp");
		            view.forward(request,response);
    				wrt.println(checkStudent+" Check");
    			}
				}	
				//not workink after last If candition
			}

		wrt.println("</body></html>");

       }	

    catch (Exception ex) {
	      	;
	}

}

}