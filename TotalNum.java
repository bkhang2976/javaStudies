import java.util.*;

public class TotalNum{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("원하는 숫자를 입력하세요");

        int number = input.nextInt();
        int sum=0;
        String target = Integer.toString(number);
        //입력받은 숫자를 문자열로 변환.
        String[] parts = target.split("");
        //문자열을 단위별로 자르고 이를 문자열 배열에 저장.

        for(int i=0; i<target.length(); i++){
            int numbers = Integer.parseInt(parts[i]);
            sum+= numbers;
            //반복문을 통해서 다시 배열에 있는 분자열들의 요소를 정수로 변환.
            //그다음에 숫자들을 더한다.
        }


        System.out.println("입력한 수의 합은 ="+sum);
        input.close();
        //입력 닫기

    }
}
