import java.util.*;
public class HashMapNations{
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner input = new Scanner(System.in);
        String country="";
        String name="";
        String search ="";
        boolean determiner =true;

        while(determiner){

            System.out.println("나라 이름과 인구를 입력하세요. ex: Korea 5000 enter stop to finish");
            country = input.nextLine();
            
            /*System.out.println(country);
            System.out.println(country.equals("stop"));*/

            if(country.equals("stop")==true){
                determiner=false;
            }
          
            
            String[] a = country.split(" "); 
            if(a.length > 1){
                name = a[0];
                nations.put(name, Integer.parseInt(a[1]));
            }
        }

        System.out.println("검색할 나라명 입력: ");
        search = input.nextLine();

        if(nations.get(search)!=null){
            System.out.println(search+"의 인구는 "+nations.get(search)+"명 입니다.");
        }else if(nations.get(search)==null){
            System.out.println(search+"라는 나라는 없습니다.");
        }

        input.close();
        }
}