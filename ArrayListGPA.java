import java.util.*;
public class ArrayListGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Character> alist = new ArrayList<Character>();
        String grades= "";

        System.out.println("성적을 입력하세요: A B C D F");
        grades=input.next();
        
        System.out.println(grades);
        
    

        input.close();
    }
}
