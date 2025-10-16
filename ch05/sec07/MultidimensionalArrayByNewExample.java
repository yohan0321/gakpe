package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 2학년 1반과 2반의 수학 점수를 저장하는 2차원 배열 생성
        int[][] mathScores = new int[2][3];

        for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
            for (int k = 0; k < mathScores[i].length; k++) { // 각 반의 학생 수만큼 반복
                System.out.println("mathScores[" + i + "][" + k + "]: " + mathScores[i][k]);
            }
        }

        System.out.println();

        // 값 저장
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 전체 학생의 수학 평균 구하기
        int totalMathSum = 0;
        int totalStudent = 0;
        for (int i = 0; i < mathScores.length; i++) { // 반의 수만큼 반복
            totalStudent += mathScores[i].length; // 반의 학생 수 합산
            for (int k = 0; k < mathScores[i].length; k++) { // 각 반의 학생 점수 합산
                totalMathSum += mathScores[i][k];
            }
        }

        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);

        // 2학년 1반과 2반의 영어 점수를 저장하는 2차원 배열 생성
        int[][] englishScores = new int[2][2];
        englishScores[0] = new int[2];
        englishScores[1] = new int[2];

        for (int i = 0; i < englishScores.length; i++) { // 반의 수만큼 반복
            for (int k = 0; k < englishScores[i].length; k++) { // 각 반의 학생 수만큼 반복
                System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
            }
        }

        System.out.println();

        // 값 저장
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;

        // 전체 학생의 영어 평균 구하기
        int totalEnglishSum = 0;
        totalStudent = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}
