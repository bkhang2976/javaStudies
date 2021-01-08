import java.util.*;

class Student{
    private String name="";
    private String major="";
    private String stuno="";
    private String gpa="";

    public void setName(String name){
        this.name=name;
    }

    public void setMajor(String major){
        this.major=major;
    }

    public void setStuno(String stuno){
        this.stuno = stuno;
    }

    public void setGpa(String gpa){
        this.gpa=gpa;
    }

    public String getName(){
        return name;
    }
    
    public String getMajor(){
        return major;
    }

    public String getStuno(){
        return stuno;
    }

    public String getGpa(){
        return gpa;
    }

    public void infoPrint(){
        System.out.print(getName() +" "+getMajor()+" "+getStuno()+" "+getGpa()+"\n");
    }
} 

public class StudentInfoHash{
    public static void main(String[] args) {
        boolean determiner = true;
        Scanner input = new Scanner(System.in);
       
        String info = "";
        HashMap <String, Student> studentInfo = new HashMap<String, Student>();
    
        while(determiner!=false){
            System.out.println("학생의 이름,학과,학번,학점평균 입력");
            info = input.nextLine();

            if(info.equals("stop")==true){
                determiner=false;
            }

            String[] a = info.split(",");

            if(a.length>1){
                Student student = new Student();
                student.setName(a[0].toString());
                student.setMajor(a[1].toString());
                student.setStuno(a[2].toString());
                student.setGpa(a[3].toString());
                studentInfo.put(student.getName(),student);
                
            }
            
        }

        boolean abc = true;

        while(abc!=false){
            System.out.println("학생이름");
            String search = input.nextLine();
            if(search.equals("stop")){
                abc=false;
            }

            Student information = studentInfo.get(search);
            if(information!=null){
                information.infoPrint();
            }else if(information.get(search)==null){
                System.out.println("학생이 존재하지 않습니다.");
            }
        }
        
        input.close();
    }
}