import java.util.*;
public class RainfallVector {
    public static void main(String[] args) {
        Vector<Integer> raintot = new Vector<Integer>();
        Iterator<Integer> it = raintot.iterator();
        Scanner input = new Scanner(System.in);

        int rainfall=0;
        int sum =0;
        boolean determiner = true;
        
        while(determiner){
            System.out.println("강수량 입력: ");
            rainfall = input.nextInt();
            raintot.add(rainfall);
            if(rainfall==0){
                determiner=false;
            }
            
        }
        
        it = raintot.iterator();
        while(it.hasNext()){
            int r = it.next();
            sum+=r;
        }

        int avg = sum/(raintot.size()-1);

        System.out.println("현재평균: " + avg);

        input.close();
    }
}
