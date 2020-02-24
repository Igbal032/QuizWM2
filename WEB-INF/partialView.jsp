<%@ page import = "java.util.*, wm2.quiz.Student,wm2.quiz.Question"%> 

<html>
<style type="text/css">
  #mainDiv p{
    padding: 10px;
  }
  .forButtons button{
    width: 100px;
    height: 30px;
  }
  .forFinishButton button{
    width: 100px;
    height: 30px;
  }
</style>
<head><title>Quiz Page</title></head>

<body>
  <h1 style="text-align: center;">Next Question</h1>
  
<!-- 
 <%
  Student stInfo = (Student)session.getAttribute("studentInfo");
 %> -->
  <%
  Student stData = (Student)session.getAttribute("newStudent");
  //Iterator it = stData.iterator();

  //hile (it.hasNext()) {
    //Student std = (Student)it.next();
 %>
  <tr>
    <td><%=stData.getId()%></td>
    <td><%=stData.getFirstName()%></td> 
    <td><%=stData.getLastName()%></td>
    <td><%=stData.getEmail()%></td>
  </tr>


  <!-- <tr>
    <td>1</td>
    <td>Igbal</td> 
    <td>Hasanli</td>
    <td>Email</td>
  </tr> -->
  </table>
<div id="mainDiv" style="border: 5px solid green; height: 500px; width: 800px; margin: 0 auto;position: relative;">
  <div class="hoverDiv" style="position: absolute;width: 100%; height: 100%; background-color: green; opacity: 0.9; display: none;">
    <h1 style="text-align: center;margin-top:25%;">Finish</h1>
  </div>
  <form action="/Quiz/question-servlet" method="GET">
  <h4>Sual.1</h4>
  <%
  // ArrayList<Question> questionList = new ArrayList<Questio>();

  // Question newQuestion = new Question();
  // newQuestion.SetId(1);
  // newQuestion.setQstatement("How are you?");
  // newQuestion.setVariants(1,"Yaxsh");
  // newQuestion.setVariants(2,"Normal");
  // newQuestion.setVariants(3,"Pis");
  // newQuestion.setAnswerId(3);
  // questionList.add(newQuestion);
  // System.out.println(newQuestion.getQstatement()+" True");

  while (it.hasNext()) {
    Student std = (Student)it.next();

  %>
  <p>Statement</p>
  <p><input id="first" type="radio" name="variant" value="a"><label for="first">A) 1 </label></input></p>
  <p><input id="second" type="radio" name="variant" value="b"><label for="second">B)  2.</label></input></p>
  <p><input id="third" type="radio" name="variant" value="c"><label for="third">C)  3.</label></input></p>
  <p><input id="fourth" type="radio" name="variant" value="d"><label for="fourth">D) 4</label></input></p>
  <div class="forButtons" style="display: flex;justify-content: space-around; padding: 50px"><button>Geriyə</button> <button>İrəli</button></div>
  <div id="forFinishButton" style="display: flex;justify-content: center;"><button>Bitir</button></div>
  <div class="content" style="display: flex;justify-content: space-between;">
  <p>Düzgün cavabların sayı: 7</p>
  <p>Yanlış cavabların sayı: 3</p>
  </div>
  </form>
</div>

  

</body>

</html>
