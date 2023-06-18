package Chapter05.Ex05;

public class ArrayEx5 {
    public static void main(String[] args) {
        //합과 평균을 구하는 예제
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

    }
}
