import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// weights 
        System.out.print("Homework weight? ");  
        final int HM_WEIGHT =  sc.nextInt();
        System.out.print("Exam 1 weight? ");
        final int EXAM1_WEIGHT = sc.nextInt();
        final int EXAM2_WEIGHT = 100 - HM_WEIGHT - EXAM1_WEIGHT;
        System.out.println("Using weight of "+ HM_WEIGHT +" " + EXAM1_WEIGHT +" " +
EXAM2_WEIGHT);
// scores 
   
   System.out.println("Homework:");
   System.out.print("Number of assignments? ");
   int numberOfAssignments = sc.nextInt();
   System.out.print("Average Homework grade? ");
   float averageHomeworkGrade = sc.nextFloat();
   System.out.print("Number of late days used? ");
   int numberOfLateDays = sc.nextInt();
   System.out.print("Labs attended? ");
   int labsAttended = sc.nextInt();
   float totalPoints = calcAssignmentsGrade(
           numberOfAssignments,
           averageHomeworkGrade,
           labsAttended,
           numberOfLateDays
   );
   float maxPoints = numberOfAssignments * (10 + 4);
   System.out.println("Total points = " + totalPoints + "/" + maxPoints);
   float weightedScore = totalPoints / maxPoints * HM_WEIGHT;
   System.out.println("Weighted score: " + String.format("%.2f", weightedScore));
   
//exam1
        System.out.println("Exam 1:");
        System.out.print("Score? ");
        int exm1Score = sc.nextInt();     
        System.out.print("Curve? ");
        int exm1Curve = sc.nextInt();
     
     
        if(exm1Score <= 0)
            exm1Score = 0;
        else if(exm1Score > 100)
            exm1Score = 100;
     
        double achievedExm1Score = Math.min(100, exm1Score + exm1Curve);     
        double fullExm1Points = 100;    
        System.out.println("Total points = " + achievedExm1Score + " / " + 
fullExm1Points);     
        double achievedExm1Points = achievedExm1Score / fullExm1Points;     
        double weightedExm1Score = EXAM1_WEIGHT * achievedExm1Points;     
        System.out.println("Weighted score = " + weightedExm1Score);
//exam2 
        System.out.println("Exam 2:");
        System.out.print("Score? ");
        int exm2Score = sc.nextInt();     
        System.out.print("Curve? ");
        int exm2Curve = sc.nextInt();
        if(exm2Score <= 0)
            exm2Score = 0;
        else if(exm2Score > 100)
            exm1Score = 100;
     
        double achievedExm1Score2 = Math.min(100, exm2Score + exm2Curve);     
        double fullExm1Points2 = 100;    
        System.out.println("Total points = " + achievedExm1Score2 + " / " + 
fullExm1Points2);     
        double achievedExm1Points2 = achievedExm1Score2 / fullExm1Points2;     
        double weightedExm1Score2 = EXAM2_WEIGHT * achievedExm1Points2;     
        System.out.println("Weighted score = " + weightedExm1Score2  );
  // final grade   
        weightedScore = totalPoints / maxPoints * HM_WEIGHT;
        double courseGrade = weightedScore + weightedExm1Score + 
weightedExm1Score2;
        System.out.println("Course grade = " + courseGrade);
}
private static float calcAssignmentsGrade(int numberOfAssignments,
                                         float averageHomeworkGrade, int 
labsAttended, int numberOfLateDays) {
   if (averageHomeworkGrade <= 0) {
       averageHomeworkGrade = 0;
   }
   else if (averageHomeworkGrade > 10) {
       averageHomeworkGrade = 10;
   }
   float totalPoints = numberOfAssignments * averageHomeworkGrade + labsAttended * 
4;
   float maxPoints = numberOfAssignments * (10+4);
   if (numberOfLateDays > numberOfAssignments / 2) {
       totalPoints *= 0.9; 
   }
   else if (numberOfLateDays == 0) {
       totalPoints += 5;
       if (totalPoints > maxPoints)
           totalPoints = maxPoints;
   }
   if (numberOfAssignments <= 0) {
       totalPoints = maxPoints;
   }
   return totalPoints;
}

}
