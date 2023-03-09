

import java.*;
import java.util.ArrayList;
import java.util.List;
import jdk.incubator.vector.VectorOperators.Test;
public class driver {
    public static void main(String[] args) {
        List<Object> questions =new ArrayList<>();
        questions.add(new Question());
        questions.add(new ObjectiveQuestion());
        questions.add(new FillInTheBlankQuestion());
        questions.add(new mutliplechoicequstion());
        Test studentTest= new test(questions);
System.out.println(" Our testing ");
System.out.println("RESsult:" + studentTest.getTotalpoints());
System.out.println(studentTest);
System.out.println( " the answer key");
System.out.println(studentTest.toAnswerString());
    }
    
}
