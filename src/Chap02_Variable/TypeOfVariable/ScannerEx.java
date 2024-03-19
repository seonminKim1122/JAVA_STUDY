package Chap02_Variable.TypeOfVariable;

import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 문자열을 숫자로 변환

        System.out.printf("입력내용 :%s%n", input);
        System.out.printf("num=%d%n", num);
    }
}
