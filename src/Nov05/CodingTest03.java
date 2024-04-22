package Nov05;

public class CodingTest03 {
    public static int solution(int[] A) {
        int maxNum = -1;
        System.out.println("solution 6");
        for (int i = 0; i < A.length; i++) {
            //A[i]의 숫자를 boolean 배열로 변환시키고, 해당 배열을 기준으로 for 문을 한번 더 돌면서 해당 배열과 같은 수가 있는지 체크
            boolean[] booleanA = booleanArrayForExistDigit(A[i]);
            System.out.println("solution 10");
            for (int j = i; j < A.length; j++) {
                boolean[] booleanB = booleanArrayForExistDigit(A[j]);
                System.out.println("solution 13");
                if (!hasSameDigits(booleanA, booleanB)) {
                    if ((A[i] + A[j]) > maxNum) {
                        maxNum = A[i] + A[j];
                    }
                }
            }
        }
        System.out.println("solution 21");
        return maxNum;
    }

    //두 boolean 배열을 비교해서 같은 index 값이 true 인지 아닌지 판별하여 true, false 반환하기
    private static boolean hasSameDigits(boolean[] booleansA, boolean[] booleansB) {
        boolean haveSameDigit = false;
        //boolean 배열은 0~9까지의 자릿수를 갖고 있으므로 0~9까지 돌면서 같은 true 값을 갖고 있는지 확인
        for (int i = 0; i < 10; i++) {
            //booleanA 기준으로 booleanB를 10번 돌면서 같은 값이 있는지 확인
            for (int j = i; i < 10; j++) {
                if (booleansA[i] && booleansB[j]) {
                    //같은 자릿수에 true 값이 담겨있음
                    haveSameDigit = true;
                }
            }
        }
        return haveSameDigit;
    }


    //매개변수안에 담긴 정수의 자릿수를 각각 boolean 배열에 true 로 변환시켜 대입하기
    private static boolean[] booleanArrayForExistDigit(int num) {
        boolean[] existDigit = new boolean[10];
        int currentNum = num;
        while (currentNum > 0) {
            System.out.println("booleanArrayForExist 45");
            currentNum = num % 10;
            existDigit[currentNum] = true;
            currentNum /= 10;
        }
        System.out.println("booleanArrayForExist 50");
        return existDigit;
    }


    public static void main(String[] args) {
        //?
        int[] array1 = {25, 35, 501, 256};
        //130
        int[] array2 = {77, 23, 37, 107};
        System.out.println(solution(array1));
        System.out.println("main 57");
        System.out.println(solution(array2));
    }
}
