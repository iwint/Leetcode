package Others;

import java.util.Arrays;

public class AbsentStudents {
    public static String Abs(int N, String[] A, int M, String[] P) {

        if (N == M) {
            return "Hooray! All are present";
        }

        for (int i = 0; i < N; i++) {
            if (!Arrays.asList(P).contains(A[i])) {
                return A[i];
            }
        }

        return "Hooray! All are present";

    }

    public static void main(String[] args) {

        System.out.println(Abs(
                5,
                new String[]{"Iwin", "Issac", "Jerin", "Jack", "Moses"},
                4,
                new String[]{"Jack", "Iwin", "Issac"})
        );

    }
}
