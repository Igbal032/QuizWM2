package wm2.quiz;
import java.util.*;
public class Question{


	private Integer qId;
	private String qStatement;
	private Integer answerId;

	
	public Integer getId(){return qId;}
	public String getQstatement(){return qStatement;}
	public Integer getAnswerId(){return answerId;}

	public void SetId(int Id){
		this.qId=Id;
	}
	public void setQstatement(String sQues){
		this.qStatement=sQues;
	}

	public void setAnswerId(int ansId){
		this.answerId=ansId;
	}

}