

import java.util.*;
import java.io.*;
public class mutliplechoicequstion extends  questions{
    String[] possibleAnswers;
    public mutliplechoicequstion(String correctAnswers, String[] possibleAnswers, 
String questionText, int points, int diff ,int answerSpace) {
        super(correctAnswers, questionText, points, diff,answerSpace);
        this.possibleAnswers= possibleAnswers;
        this. questionType= "(mutliplechoicequstion)";
    }
@Override
public String toString(){
    String s= questionType + "" + questionHeader + questionText + "\n" ;
    for (int=0; i<possibleAnswers.length; i++)
    s += " " + (i+1) + "." +possibleAnswers[i] + "\n";
    s+= quesitonSpace;
    return s;
} 
@Override
public String toStringAnswer(){
    String s=   questionType + "" + questionHeader + questionText + "\n" ;
    for (int=0; i<possibleAnswers.length; i++){
        s += " " + (i+1) + "." ;
        if (possibleAnswers[i].equals(correctAnswers))
        s+= "" + possibleAnswers[i] + " " + "\n";
        else 
        s+= possibleAnswers[i] + "\n";
    }
    s+= quesitonSpace;
    return s;
}
    
}
