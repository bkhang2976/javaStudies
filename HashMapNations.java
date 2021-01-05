import java.util.*;
public class HashMapNations{
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        String country="";
        String name="";
        int population = 0;
        String search ="";
       /* boolean determiner =true;

        if(country.equals("그만")){
            return;
        }*/

        while(!country.equals("그만")){

            if(country.equals("그만")){
                return;
             }

            System.out.println("나라 이름과 인구를 입력하세요. ex: Korea 5000");
            country = input.nextLine();
            String[] a = country.split(" ");  
            name = a[0];
            population = Integer.parseInt(a[1]);
            nations.put(name, population);
            
        }

            System.out.println("검색할 나라명 입력: ");
            search = input.nextLine();

            if(nations.get(search)!=null){
                System.out.println(search+"의 인구는 "+nations.get(search)+"명 입니다.");
            }else if(nations.get(search)==null){
                System.out.println(search+"라는 나라는 없습니다.");
            }
        }
        //input.close();
}

