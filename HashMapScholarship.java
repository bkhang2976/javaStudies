import java.util.*;

class Info{
    private String name="";
    private double grades=0.0;

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades=grades;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public Info(String name, double grades){
        this.name=name;
        this.grades=grades;
    }

    
}

public class HashMapScholarship {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> gpa = new HashMap<String, Double>();
        //boolean determiner = true;
        String information="";
        for(int i=0; i<5; i++){
            System.out.println("이름과 학점>>");
            information=input.nextLine();
                        Info info = new Info();
            if(a.length>1){
                String[] a = information.split(" ");
                double grade = Double.parseDouble(a[1]);
                info = Info(a[0], grade);
                gpa.put(info.getName(), info.getGrades());
            }
        }

        System.out.println("장학생 선발 학점 기준 입력");
        double standard = input.nextDouble();
        String [] accepted;
        String names="";
        System.out.println(gpa.keySet());    

    }
    
}
