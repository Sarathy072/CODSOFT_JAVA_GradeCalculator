import java.util.*;

class Grade_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of subjects: ");
        int subjects = sc.nextInt();
        int total = 0;
        int[] marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.println("Enter mark for subject - " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        System.out.println("\nTOTAL      : " + total);
        double avg = (double) (total) / subjects;
        System.out.println("PERCENTAGE : " + String.format("%.2f", avg));

        if (avg >= 91) {
            System.out.println("GRADE      : A");
        } else if (avg >= 81 && avg <= 90) {
            System.out.println("GRADE      : B");
        } else if (avg >= 71 && avg <= 80) {
            System.out.println("GRADE      : C");
        } else if (avg >= 61 && avg <= 70) {
            System.out.println("GRADE      : D");
        } else if (avg >= 40 && avg <= 60) {
            System.out.println("GRADE      : E");
        } else {
            System.out.println("GRADE      : F");
        }

    }
}