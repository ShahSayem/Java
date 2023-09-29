import java.util.Scanner;

public class  T4_studentScore{
    public static void main(String[] args) {

        double score[][] = new double[5][4];
        double avgScoreStud[] = new double[5];
        double avgScoreSub[] = new double[4];

        double currScore, sumScoreStud = 0, sumScoreSub = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter scores of 5 students: ");
        for (int i = 0; i < 5; i++) {
            sumScoreStud = 0;
            System.out.print("Score of student "+(i+1)+ ": ");
            for (int j = 0; j < 4; j++) {
                currScore = sc.nextDouble() ;
                score[i][j] = currScore;

                sumScoreStud += currScore;
            }
            avgScoreStud[i] = sumScoreStud/4;
        }

        for (int i = 0; i < 4; i++) {
            sumScoreSub = 0;
            for (int j = 0; j < 5; j++) {
                sumScoreSub += score[j][i];
            }
            avgScoreSub[i] = sumScoreSub/5;
        }

        System.out.println("Average score of each students: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student "+(i+1)+ ": "+avgScoreStud[i]);
        }

        System.out.println("Average score of each subjects: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Subject "+(i+1)+ ": "+avgScoreSub[i]);
        }
    }
}
