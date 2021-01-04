import java.util.*;

public class VectorInteger{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("정수를 입력하세요 (-1)을 입력하면 종료");   
    int a = 0;
    int maximum=0;
    Vector<Integer> vector = new Vector<Integer>();
    
    while(a!=-1){
      a = input.nextInt();
      //int i=0;
      vector.add(a);          
    }

    for(int i=0; i<vector.size(); i++){
      
      int comparison = vector.get(i);
      if(comparison>maximum){
        maximum=comparison;
      }
      System.out.print(vector.get(i)+", ");
    }
    System.out.println("최대수의 값은: "+maximum);

    input.close();
    
  }
}
