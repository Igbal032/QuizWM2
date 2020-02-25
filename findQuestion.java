package wm2.quiz;

import java.util.*;
import wm2.quiz.Question;
public class findQuestion{

	ArrayList<Question> questionList;
	public findQuestion(){
	questionList = new ArrayList<Question>();

	Question newQuestion1 = new Question();
    newQuestion1.SetId(1);
    newQuestion1.setQstatement("How are you?");
    newQuestion1.setVarId1(1);
    newQuestion1.setVarStat1("Yaxshi");
    newQuestion1.setVarId2(2);
    newQuestion1.setVarStat2("Normal");
    newQuestion1.setVarId3(3);
    newQuestion1.setVarStat3("Pis");
    newQuestion1.setAnswerId(3);
    questionList.add(newQuestion1);
  
    Question newQuestion2 = new Question();
    newQuestion2.SetId(2);
    newQuestion2.setQstatement("How are you?");
    newQuestion2.setVarId1(1);
    newQuestion2.setVarStat1("Yaxshi");
    newQuestion2.setVarId2(2);
    newQuestion2.setVarStat2("Normal");
    newQuestion2.setVarId3(3);
    newQuestion2.setVarStat3("Pis");
    newQuestion2.setAnswerId(3);
    questionList.add(newQuestion2);
  
    Question newQuestion3 = new Question();
    newQuestion3.SetId(3);
    newQuestion3.setQstatement("How are you?");
    newQuestion3.setVarId1(1);
    newQuestion3.setVarStat1("Yaxshi");
    newQuestion3.setVarId2(2);
    newQuestion3.setVarStat2("Normal");
    newQuestion3.setVarId3(3);
    newQuestion3.setVarStat3("Pis");
    newQuestion3.setAnswerId(3);
    questionList.add(newQuestion3);   
     
  
    Question newQuestion4 = new Question();
    newQuestion4.SetId(4);
    newQuestion4.setQstatement("How are you?");
    newQuestion4.setVarId1(1);
    newQuestion4.setVarStat1("Yaxshi");
    newQuestion4.setVarId2(2);
    newQuestion4.setVarStat2("Normal");
    newQuestion4.setVarId3(3);
    newQuestion4.setVarStat3("Pis");
    newQuestion4.setAnswerId(3);
    questionList.add(newQuestion4);   
  
    Question newQuestion5 = new Question();
    newQuestion5.SetId(5);
    newQuestion5.setQstatement("How are you?");
    newQuestion5.setVarId1(1);
    newQuestion5.setVarStat1("Yaxshi");
    newQuestion5.setVarId2(2);
    newQuestion5.setVarStat2("Normal");
    newQuestion5.setVarId3(3);
    newQuestion5.setVarStat3("Pis");
    newQuestion5.setAnswerId(3);
    questionList.add(newQuestion5);   
  
    Question newQuestion6 = new Question();
    newQuestion6.SetId(6);
    newQuestion6.setQstatement("sssssss are you?");
    newQuestion6.setVarId1(1);
    newQuestion6.setVarStat1("Yasssssxshi");
    newQuestion6.setVarId2(2);
    newQuestion6.setVarStat2("Norsssmal");
    newQuestion6.setVarId3(3);
    newQuestion6.setVarStat3("Psssis");
    newQuestion6.setAnswerId(3);
    questionList.add(newQuestion6);   
  
    Question newQuestion7 = new Question();
    newQuestion7.SetId(7);
    newQuestion7.setQstatement("How are you?");
    newQuestion7.setVarId1(1);
    newQuestion7.setVarStat1("Yaxshi");
    newQuestion7.setVarId2(2);
    newQuestion7.setVarStat2("Normal");
    newQuestion7.setVarId3(3);
    newQuestion7.setVarStat3("Pis");
    newQuestion7.setAnswerId(3);
    questionList.add(newQuestion7);   
  
    Question newQuestion8 = new Question();
    newQuestion8.SetId(8);
    newQuestion8.setQstatement("How are you?");
    newQuestion8.setVarId1(1);
    newQuestion8.setVarStat1("Yaxshi");
    newQuestion8.setVarId2(2);
    newQuestion8.setVarStat2("Normal");
    newQuestion8.setVarId3(3);
    newQuestion8.setVarStat3("Pis");
    newQuestion8.setAnswerId(3);
    questionList.add(newQuestion8);   
  
    Question newQuestion9 = new Question();
    newQuestion9.SetId(9);
    newQuestion9.setQstatement("How are you?");
    newQuestion9.setVarId1(1);
    newQuestion9.setVarStat1("Yaxshi");
    newQuestion9.setVarId2(2);
    newQuestion9.setVarStat2("Normal");
    newQuestion9.setVarId3(3);
    newQuestion9.setVarStat3("Pis");
    newQuestion9.setAnswerId(3);
    questionList.add(newQuestion9);    
  
    Question newQuestion10 = new Question();
    newQuestion10.SetId(10);
    newQuestion10.setQstatement("How are you?");
    newQuestion10.setVarId1(1);
    newQuestion10.setVarStat1("Yaxshi");
    newQuestion10.setVarId2(2);
    newQuestion10.setVarStat2("Normal");
    newQuestion10.setVarId3(3);
    newQuestion10.setVarStat3("Pis");
    newQuestion10.setAnswerId(3);
    questionList.add(newQuestion10); 
	}
  
	  
	public Question findQuestionWithId(Integer qId){

		// int qID = Integer.parseInt(qId);
		Question returnedQuestion = new Question();
		Iterator iterator = questionList.iterator();
		while(iterator.hasNext()) {
			Question std = (Question)iterator.next();
    		if (std.getId().equals(qId)) {

    			returnedQuestion = std;
    		}

		}
		return returnedQuestion;
	}

}