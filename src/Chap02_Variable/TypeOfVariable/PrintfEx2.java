package Chap02_Variable.TypeOfVariable;

public class PrintfEx2 {

    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f; // 0.10
        float f2 = 1e1f; // 10.0
        float f3 = 3.14e3f; // 3140.0
        double d = 1.23456789;

        // %f : 기본 소수점 아래 6자리까지 출력
        // %e : 지수표현식으로 출력
        // %g : 간략한 형식으로 출력
        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); // "f1=0.100000, 1.000000e-01, 0.100000"
        System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); // "f2=10.000000, 1.0000000e+01, 10.0000"
        System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); // "f3=3140.00000, 3.140000e+03, 3140.00"

        System.out.printf("d=%f%n", d); // "d=1.234568"
        System.out.printf("d=%14.10f%n", d); // "d=  1.2345678900", 총 14자리 중에서 소수점 아래에 10자리 사용

        System.out.printf("[12345678901234567890]%n"); // "[12345678901234567890]"
        System.out.printf("[%s]%n", url); // "[www.codechobo.com]"
        System.out.printf("[%20s]%n", url); // "[   www.codechobo.com]", 총 20자리 사용 남으면 왼쪽 공백
        System.out.printf("[%-20s]%n", url); // "[www.codechobo.com   ]", 총 20자리 사용 남으면 오른쪽 공백
        System.out.printf("[%.8s]", url); // "[www.code]", 문자열의 앞부터 8자리만 출력
    }
}
