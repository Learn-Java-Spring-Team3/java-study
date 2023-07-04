import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {

        // 산술 연산자

        int a = 10;
        int b = 20;
        String c = "abc";

        System.out.println(a + c); // 문자열이 아닌 데이터와 함께 사용하면 문자열로 변환됨

        double d = 10;
        double e = 20;
        System.out.println(d / e); // 소수 형태로 사용하면 계산 결과가 출력됨

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 정수 형태로 사용하면 나눗셈의 몫이 계산됨
        System.out.println(a % b);

        // 비교 연산자

        int i = 5;
        int j = 8;

        System.out.println(a > b);
        System.out.println(a > b);

        System.out.println(a >= b);
        System.out.println(a >= b);

        // = 대입연산자, == 비교연산자
        System.out.println(a == b);
        System.out.println(a != b);

        // 논리 연산자

        int l = 3;
        int m = 3;
        int n = 5;

        // and(&&) - 교집합
        System.out.println(n > l && n > m); // true && true

        // or(||) - 합집합
        System.out.println(n > l || n < m); // true || false

        // not(!) - 여집합
        System.out.println(!true);
        System.out.println(!false);

        // 대입 연산자

        int k = 1;
        double price = 12.5;

        // 증감 연산자
        // k++; // k = k + 1
        // k--; // k = k - 1
        // System.out.println(a++);
        // System.out.println(a);
        System.out.println(++a);




    }
}
