package wm2.quiz;

public class  Student{

	// public Student(){

	// }

	private Integer Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private Integer currentQuestionId;
	
	public Integer getId(){return Id;}
	public String getFirstName(){return FirstName;}
	public String getLastName(){return LastName;}
	public String getEmail(){return Email;}
	public String getPassword(){return Password;}
	public Integer getCurrentQuestionId(){return currentQuestionId;}

	public void setId(Integer id){this.Id=id;}
	public void setName(String Name){this.FirstName=Name;}
	public void setSurname(String Surname){this.LastName=Surname;}
	public void setEmail(String mail){this.Email=mail;}
	public void setPassword(String psw){this.Password=psw;}
	public void setCurrentQuestionId(int crtQuId){this.currentQuestionId=crtQuId;}

}