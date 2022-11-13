package com.javalearning;

public class GradeCheckers {
    public static void main(String[] args) {
        getGrade(40,40,40);
    }
    public static char getGrade(int s1, int s2, int s3) {
        char result = 'F';
        int score = (s1 + s2 + s3) / 3;
        if (score >= 90) result = 'A';
        if (score >= 80 && score < 90) result = 'B';
        if (score >= 70 && score < 80) result = 'C';
        if (score >= 60 && score < 70) result = 'D';
        System.out.println(result);
        return result;
    }
}
