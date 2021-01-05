import java.util.*;
public class ArrayListGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Character> alist = new ArrayList<Character>();
        HashMap<Character, Double> scoreboard = new HashMap<Character, Double>();
        System.out.println("성적을 입력하세요: A B C D F");
        String grades=input.nextLine(); 
        String[] a = grades.split(" ");
        double scores=0;
        double gpa=0;       

        scoreboard.put('A', 4.0);
        scoreboard.put('B', 3.0);
        scoreboard.put('C', 2.0);
        scoreboard.put('D', 1.0);
        scoreboard.put('F', 0.0);
        
        for (int i=0; i<a.length; i++){
            alist.add(a[i].charAt(0));
        }
        
        for(int i=0; i<alist.size(); i++){
            scores+=scoreboard.get(alist.get(i));
        }
        gpa=scores/alist.size();
        
        System.out.println("gpa ="+gpa);
        
        input.close();
    }
}
