import java.util.*;
public class ArrayListGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> alist = new ArrayList<Character>();
        
        System.out.println("성적을 입력하세요: A B C D F");
        String grades=input.nextLine();
        //nextLine() 으로 설정해줘야 " "이 입력된 문자열이 들어간다. 
        
        System.out.println(grades);
        
    

        input.close();
    }
}
