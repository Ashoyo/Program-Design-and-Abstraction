

import java.util.*;
import java.io.*;
public class ObjectiveQuestion extends Question {
    
    
    String[] CorrectAnswers;
public FillInTheBlankQuestion(String correctAnswers, String[] possibleAnswers, 
String questionText, int points, int diff ,int answerSpace)  {
    super(correctAnswers, questionText, points, diff,answerSpace);
    this.questionType= "(ObjectiveQuestion)"
    
}
public String toString(){
    return questionText + " " + questionheader + "" + questionText + "\n" + 
questionSpace;
}
public String toStringAnswer(){
    return questionType + " " + questionheader + " " + CorrectAnswers + "" + 
questionText + questionSpace ;
}
}
