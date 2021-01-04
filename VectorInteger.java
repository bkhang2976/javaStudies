import java.util.*;

public class VectorInteger{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("정수를 입력하세요 (-1)을 입력하면 종료");   
    int a = 0;
    Vector<Integer> vector = new Vector<Integer>();
    
    while(a!=-1){
      a = input.nextInt();
      vector.add(a);
     
    }

    input.close();
    return;
  }
}
