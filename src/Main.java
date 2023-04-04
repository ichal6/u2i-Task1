public class Main {
    public static void main(String[] args) {
        for(int i = -1; i < 51; i++){
            System.out.println("For " + i + " result = " + solution(i));
        }
    }

    public static int solution(int N) {
        for (int possibleSolution = 0; possibleSolution <= 1000000; possibleSolution++) {
            int sum = 0;
            int tempNum = possibleSolution;
            while (tempNum > 0) {
                sum += tempNum % 10; // add last digit to sum
                tempNum /= 10; // remove last digit
            }
            if (sum == N) {
                return possibleSolution;
            }
        }
        return -1; // no solution found
    }
}